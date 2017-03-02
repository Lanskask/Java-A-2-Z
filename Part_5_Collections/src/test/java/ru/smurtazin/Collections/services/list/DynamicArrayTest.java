package ru.smurtazin.Collections.services.list;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by a1 on 02.03.17.
 */
public class DynamicArrayTest {
    //    DynamicArray dynamicArray = new DynamicArray(new Object[] {1, 2, 3, 4} );
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
        this.dynamicArray.printAll();
    }

    @Test
    public void increaseArraySize() throws Exception {

    }

    @Test
    public void get() throws Exception {
        assertThat( (Integer) this.dynamicArray.get(4), is(5));
    }

}