package ru.smurtazin.Collections.services.list.Set;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by a1 on 03.03.17.
 */
public class SimpleSet<E> {

    Object[] array;
    int index = 0;
    int iteratorPosition = 0;
    int nowArraySize;

    public SimpleSet() { }

    public SimpleSet(int size) {
        this.array = new Object[size];
        this.nowArraySize = size;
    }

    public void add(E e) {
        this.array[this.index++] = e;
    }

    public Iterator<E> iterator() {
        return new Itr();
    }

    public E get(int index) {
        return (E) this.array[index];
    }

    // todo need to check
    private class Itr implements Iterator<E> {

        public boolean hasNext() {
            return SimpleSet.this.array.length > SimpleSet.this.iteratorPosition+1 &&
                    SimpleSet.this.array[iteratorPosition+1] != null;
        }

        public E next() {
            return (E) SimpleSet.this.array[SimpleSet.this.iteratorPosition++];
        }

        public void remove() { }
    }

}
