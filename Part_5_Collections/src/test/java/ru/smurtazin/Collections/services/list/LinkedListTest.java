package ru.smurtazin.Collections.services.list;

import org.junit.Test;
import ru.smurtazin.Collections.services.list.LinkedList.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 02.03.17.
 */
public class LinkedListTest {

    LinkedList linkedList = new LinkedList(); // Создание нового списка

    @Test
    public void isEmpty_return_true() throws Exception {
        assertThat(this.linkedList.isEmpty(), is(true));
    }

    @Test
    public void isEmpty_return_false() throws Exception {
        this.linkedList.insertFirst(44, 4.99);
        this.linkedList.insertFirst(66, 6.99);
        this.linkedList.insertFirst(88, 8.99);

        assertThat(this.linkedList.isEmpty(), is(false));
    }

    // It is testing of methods: insertFirst & find
    @Test // TODO Так можно проверять тестировать? т.е. 2а метода в одном тесте?
    public void find() throws Exception {
        this.linkedList.insertFirst(44, 4.99);

        assertThat( (Double) this.linkedList.find(44).getElement(), is(4.99));
    }

    @Test // The same as in previous test
    public void insertFirst() throws Exception {
        this.linkedList.insertFirst(44, 4.99);

        assertThat( (Double) this.linkedList.find(44).getElement(), is(4.99));
    }

    @Test
    public void deleteFirst() throws Exception {
        this.linkedList.insertFirst(44, 4.99);
        this.linkedList.deleteFirst();

        assertThat(this.linkedList.isEmpty(), is(true));
    }

    @Test
    public void displayList() throws Exception {
        this.linkedList.insertFirst(44, 4.99);
        this.linkedList.insertFirst(66, 6.99);
        this.linkedList.insertFirst(88, 8.99);

        this.linkedList.displayList();
    }

    @Test
    public void delete() throws Exception {
        this.linkedList.insertFirst(44, 4.99);
        this.linkedList.insertFirst(66, 6.99);
        this.linkedList.insertFirst(88, 8.99);

        this.linkedList.delete(66);
        assertNull(this.linkedList.find(66));
    }

}