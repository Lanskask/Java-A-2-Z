package ru.smurtazin.Collections.services;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 10.02.17.
 */
public class IteratorOddTest {

    @Test
    public void hasNext__Should_True() throws Exception {
        Iterator<Integer> iteratorOdd =
//        IteratorOdd iteratorOdd =
                new IteratorOdd(new int[] {2, 1, 3, 4, 5, 6, 7});

        boolean result = iteratorOdd.hasNext();

        assertThat(result, is(true));
    }

    @Test
    public void hasNext__Should_True__Again() throws Exception {
        IteratorOdd iteratorOdd =
                new IteratorOdd(new int[] {1, 3, 5, 7});

        boolean result = iteratorOdd.hasNext();

        assertThat(result, is(false));
    }

    @Test
    public void when_next__Should_InBegining() {
        IteratorOdd iteratorOdd =
                new IteratorOdd(new int[] {2, 1, 3, 4, 5, 6, 7});

        int result = (Integer) iteratorOdd.next();

        assertThat(result, is(2));
    }

    @Test
    public void when_next_again__Should_InCenter() {
        IteratorOdd iteratorOdd =
                new IteratorOdd(new int[] {1, 3, 4, 5, 6, 7});

        int result = (Integer) iteratorOdd.next();

        assertThat(result, is(4));
    }

    @Test(expected=NoSuchElementException.class)
    public void when_next__Should_Exception() throws Exception {
        IteratorOdd iteratorOdd =
                new IteratorOdd(new int[] {1, 3, 5});

        iteratorOdd.next();
    }

}