package ru.smurtazin.Collections.services;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a1 on 06.02.17.
 */
public class IteratorArray implements Iterator {

    private final int[] values;
    private int index = 0;

    public IteratorArray(final int[] values) {
        this.values = values;
    }

    public void remove() {} // TODO: Needed cause of implemention


    public boolean hasNext() {
        return values.length > index+1;
    }

    public Object next() {
        return values[index++];
    }

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
