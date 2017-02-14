package ru.smurtazin.Collections.services;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by a1 on 10.02.17.
 */
public class IteratorOdd implements Iterator {

    private final int[] values;
    private int index = 0;

    public IteratorOdd(final int[] values) {
        this.values = values;
    }

    public void remove() {} // TODO: Needed cause of implemention

    // ------ Realization -----------
    public boolean hasNext() {
        boolean answer = false;
        for (int hereIndex = this.index; hereIndex <= this.values.length - 1; hereIndex++) {
            index = hereIndex;
            if(this.values[index] > 1 && this.values[index] % 2 == 0) {
                answer = true;
                break;
            } else {
                continue;
            }
        }
        return answer;
    }

    public Object next() {
        int answer = 0;
        if(this.hasNext() ) {
            try {
                for (int hereIndex = this.index; hereIndex <= this.values.length - 1; hereIndex++) {
                    if( this.values[index] > 1 && this.values[hereIndex] % 2 == 0 ) {
                        answer = this.values[hereIndex];
                        break;
                    } else {
                        continue;
                    }
                }
            } catch (NoSuchElementException nsee) {
                throw nsee;
            }
        } else {
            throw new NoSuchElementException("Impossible movement");
        }
        return answer;
    }

}
