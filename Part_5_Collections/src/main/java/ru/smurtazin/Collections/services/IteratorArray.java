package ru.smurtazin.Collections.services;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a1 on 06.02.17.
 */
public class IteratorArray implements Iterator {

    private final int[] values;
    private int index = 0;

    // TODO: Shoul remove it cause it's my function?
    private int[] resultArray;

    public IteratorArray(final int[] values) {
        this.values = values;
    }

    // TODO: Shoul remove it cause it's my function?
    public void remove() {

    }

    // TODO: Shoul remove it cause it's my function?
    public int[] getResultArray() {
        return resultArray;
    }

    public boolean hasNext() {
        return values.length > index+1;
    }

    public Object next() {
        return values[index++];
    }

    // TODO: Redone right
    public Object nextOdd() {
        int answer = 0;
        for (int hereIndex = this.index; hereIndex <= this.values.length; hereIndex++) {
            index = hereIndex;
            if(this.values[index] > 1 && this.values[index] % 2 == 0) {
                answer = this.values[index];
                break;
            } else {
                continue;
            }
        }
        return answer;
    }

    // TODO: Redone right
    public Object nextSimple() {
        int answer = 0;
        int toDevide = 2;
        for (int hereIndex = this.index; hereIndex <= this.values.length; hereIndex++) {
            index = hereIndex;
            toDevide++;
            if(this.values[index] > 2 && this.values[index] % 2 == 0) {
                answer = this.values[index];
                break;
            } else {
                continue;
            }
        }
        return answer;
    }
}
