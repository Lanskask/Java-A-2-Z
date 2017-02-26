package ru.smurtazin.Collections.services.iterators;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 25.02.17.
 */
public class IteratorsIteratorTest_forHases {

    int[][] arrayOfArrays = { {1,2}, {4} };
    IteratorsIterator iteratorsIterator = new IteratorsIterator(arrayOfArrays);

    @Test
    public void hasNext_returnTrue() throws Exception {
        this.iteratorsIterator.next();
        assertThat(this.iteratorsIterator.hasNext(), is(true));
    }

    @Test
    public void hasNext_returnFalse() throws Exception {
        this.iteratorsIterator.next();
        this.iteratorsIterator.next();
        this.iteratorsIterator.next();
        assertThat(this.iteratorsIterator.hasNext(), is(false) );
    }

    @Test
    public void next() throws Exception {
        this.iteratorsIterator.next();
        this.iteratorsIterator.next();
        assertThat(4, is( this.iteratorsIterator.next()) );
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void next_catchException() throws Exception {
        this.iteratorsIterator.next();
        this.iteratorsIterator.next();
        this.iteratorsIterator.next();
        assertThat(4, is( this.iteratorsIterator.next()) );
    }

}