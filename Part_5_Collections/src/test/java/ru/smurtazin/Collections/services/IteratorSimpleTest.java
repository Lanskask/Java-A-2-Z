package ru.smurtazin.Collections.services;

import org.junit.Ignore;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 10.02.17.
 */
public class IteratorSimpleTest {

    @Test
    public void hasNext__Should_True() throws Exception {
        IteratorSimple iteratorSimple =
                new IteratorSimple(new int[] {2, 1, 3, 4, 5, 6, 7});

        boolean result = iteratorSimple.hasNext();

        assertThat(result, is(true));
    }

    @Test
    public void hasNext__Should_True__Again() throws Exception {
        IteratorSimple iteratorSimple =
                new IteratorSimple(new int[] {2, 4, 6, 8});

        boolean result = iteratorSimple.hasNext();

        assertThat(result, is(false));
    }

    @Test
    public void when_next__Should_BackOnlySimple() {
        IteratorSimple iteratorSimple =
                new IteratorSimple(new int[] {4, 6, 3, 4, 5, 6, 7});

        int result = (Integer) iteratorSimple.next();

        assertThat(result, is(3));
    }

    @Test(expected=NoSuchElementException.class)
    public void when_next__Should_BackOnlySimple_Again() {
        IteratorSimple iteratorSimple =
                new IteratorSimple(new int[] {4, 6, 8});

        iteratorSimple.next();
    }
}