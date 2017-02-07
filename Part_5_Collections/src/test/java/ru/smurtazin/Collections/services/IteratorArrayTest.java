package ru.smurtazin.Collections.services;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 06.02.17.
 */
public class IteratorArrayTest {

    // TODO: Already unneedn't
    @Ignore
    public static final class ForEachArray implements Iterable {

        private final int[] values;

        public Iterator iterator() {
            return new IteratorArray(this.values);
        }

        public ForEachArray(int[] values) {
            this.values = values;
        }
    }

    // TODO: Already unneedn't
    @Ignore
    @Test
    public void whenCallNextMethodShouldGoForward() {
        IteratorArray it =
                new IteratorArray(new int[] {1, 4});
        it.next();
        int result = (Integer) it.next();
        assertThat(result, is(4));
    }

    // TODO: Already unneedn't
    @Ignore
    @Test
    public void whenCallHasNextMethShouldReturnTheSameValue() {
        IteratorArray it =
                new IteratorArray(new int[] {1, 4});
        it.next();
        it.hasNext();
        boolean result = it.hasNext();
        assertThat(result, is(false));
    }

    // TODO: Already unneedn't
    @Ignore
    @Test
    public void foreach() {
        ForEachArray forEachArray = new ForEachArray(new int[] {1, 3, 5});

        for (Object value : forEachArray) {
            System.out.println(value);
        }
    }

    @Test
    public void whenInSeveralIntInRawShouldBackOnlyOddOfthem() {
        IteratorArray iteratorArray =
            new IteratorArray(new int[] {2, 1, 3, 4, 5, 6, 7});

        int result = (Integer) iteratorArray.nextOdd();

        assertThat(result, is(2));
    }

    @Test
    public void whenInSeveralIntInRawShouldBackOnlyOddOfThem_Again() {
        IteratorArray iteratorArray =
                new IteratorArray(new int[] {1, 3, 4, 5, 6, 7});

        int result = (Integer) iteratorArray.nextOdd();

        assertThat(result, is(4));
    }

    @Test
    public void whenInSeveralIntInRawShouldBackOnlySimpleOfThem() {
        IteratorArray it =
                new IteratorArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});

        int result = (Integer) it.nextSimple();
        assertThat(result, is(4));
    }

    @Test
    public void whenInSeveralIntInRawShouldBackOnlySimpleOfThem_OtherCheck() {
        IteratorArray it =
                new IteratorArray(new int[] {10, 1, 2, 3, 4, 5, 6, 7, 8, 9});

        int result = (Integer) it.nextSimple();
        assertThat(result, is(10));
    }

}