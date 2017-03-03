package ru.smurtazin.Collections.services.list.Set;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 03.03.17.
 */
public class SimpleSetTest {

    SimpleSet<Integer> simpleSet = new SimpleSet<Integer>(5);

    @Test
    public void add() throws Exception {
        this.simpleSet.add(1);
        this.simpleSet.add(2);
        this.simpleSet.add(3);

        assertThat(this.simpleSet.get(2), is(3));
    }

    @Test
    public void iterator_next() throws Exception {
        this.simpleSet.add(1);
        this.simpleSet.add(2);
        this.simpleSet.add(3);

        assertThat(this.simpleSet.iterator().next(), is(1));
    }

    @Test
    public void iterator_hasNext_Return_true() throws Exception {
        this.simpleSet.add(1);
        this.simpleSet.add(2);

        assertThat(this.simpleSet.iterator().hasNext(), is(true));
    }

    @Test
    public void iterator_hasNext_Return_false() throws Exception {
        this.simpleSet.add(1);
        this.simpleSet.add(2);

        this.simpleSet.iterator().next();
        this.simpleSet.iterator().next();

        assertThat(this.simpleSet.iterator().hasNext(), is(false));
    }
    
}