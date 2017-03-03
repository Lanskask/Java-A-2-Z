package ru.smurtazin.Collections.services.list;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by a1 on 02.03.17.
 */
public class DynamicArrayTest {
    DynamicArray dynamicArray = new DynamicArray(5);

    @Test
    public void size() throws Exception {
        this.dynamicArray.add(1);
        this.dynamicArray.add(2);
        this.dynamicArray.add(3);
        assertThat(this.dynamicArray.numberOfEllements(), is(3));
    }

    @Test
    public void add() throws Exception {
        this.dynamicArray.add(1);
        this.dynamicArray.add(2);
        this.dynamicArray.add(3);
        this.dynamicArray.add(4);
        this.dynamicArray.add(5);
        this.dynamicArray.add(6);

        int[] arraytoCompare = {1, 2, 3, 4, 5, 6};
        int[] newarray = new int[this.dynamicArray.numberOfEllements()];
        for (int i = 0; i < this.dynamicArray.numberOfEllements(); i++) {
            newarray[i] = ( (Integer) this.dynamicArray.array[i] ).intValue();
        }

        assertThat( newarray, is(arraytoCompare));
    }

    @Test
    public void increaseArraySize() throws Exception {
        this.dynamicArray.add(1);
        this.dynamicArray.add(2);
        this.dynamicArray.add(3);
        this.dynamicArray.add(4);
        this.dynamicArray.add(5);
        this.dynamicArray.add(6);
        this.dynamicArray.add(1);
        this.dynamicArray.add(2);
        this.dynamicArray.add(3);
        this.dynamicArray.add(4);
        this.dynamicArray.add(5);
        this.dynamicArray.add(6);
        assertThat( this.dynamicArray.numberOfEllements(), is(12));
    }

    @Test
    public void get() throws Exception {
        assertThat( (Integer) this.dynamicArray.get(4), is(5));
    }

}