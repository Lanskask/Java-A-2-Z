package ru.smurtazin.Collections.services.list.Queue;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by 1 on 03.03.2017.
 */
public class LinkedQueueTest {

    LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();

    @Test
    public void isEmpty() throws Exception {
        assertThat(this.linkedQueue.isEmpty(), is(true));
    }

    @Test
    public void size() throws Exception {
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);
        assertThat(this.linkedQueue.size(), is(3));
    }

    @Test
    public void peek() throws Exception {
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);
        assertThat(this.linkedQueue.peek(), is(1));
    }

    @Test
    public void getLast() throws Exception {
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);

        assertThat(this.linkedQueue.getLast(), is(3));
    }

    @Test // the same as previous test
    public void enqueue() throws Exception {
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);

        assertThat(this.linkedQueue.getLast(), is(3));
    }

    @Test
    public void dequeue_return_queueSize() throws Exception {
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);
        this.linkedQueue.dequeue();

        assertThat(this.linkedQueue.size(), is(2));
    }

    @Test
    public void dequeue_return_Item() throws Exception {
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);

        assertThat(this.linkedQueue.dequeue(), is(1));
    }

    @Ignore
    @Test
    public void toStringTest() throws Exception {
        System.out.println(this.linkedQueue.toString());
        this.linkedQueue.enqueue(1);
        this.linkedQueue.enqueue(2);
        this.linkedQueue.enqueue(3);

        StringBuilder s = new StringBuilder();
        for (Integer item : this.linkedQueue)
            s.append(item + " ");

        assertThat(s.toString(), is("q"));
//        assertThat(this.linkedQueue.toString(), is("q"));
    }


}