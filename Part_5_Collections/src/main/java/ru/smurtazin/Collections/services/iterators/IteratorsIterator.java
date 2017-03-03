package ru.smurtazin.Collections.services.iterators;

import java.util.Iterator;

/**
 * Created by a1 on 21.02.17.
 */
public class IteratorsIterator implements Iterator {

    private int[][] values;
    private int littleArrayNumber = 0;
    private int littleArrayPosition = 0;

    public IteratorsIterator(int[][] values ) {
        this.values = values;
    }

    public boolean hasNext() {
        return this.fullThisArraySize() >
                this.littleArrayNumber + this.littleArrayPosition + 1;
    }

    public Object next() throws ArrayIndexOutOfBoundsException {
        int answer;

        if(this.values[littleArrayNumber].length > this.littleArrayPosition - 1 ) {
            try {
                if ( this.littleArrayPosition + 1 <= this.values[littleArrayNumber].length ) {
                    answer = this.values[this.littleArrayNumber][this.littleArrayPosition];
                    this.littleArrayPosition++;
                } else {
                    this.littleArrayNumber++;
                    this.littleArrayPosition = 0;
                    answer = this.values[this.littleArrayNumber][this.littleArrayPosition];
                    this.littleArrayPosition++;
                }
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                throw aioobe;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Out of array.");
        }
        return answer;
    }

    public void remove() {} // Needed cause of implementation

    public int fullThisArraySize() {
        int fullThisArraySize = 0;
        for (int[] bigArrayPart : this.values) {
            fullThisArraySize += bigArrayPart.length;
        }
        return fullThisArraySize;
    }

}
