package ru.smurtazin.Collections.services.list.Queue;

/**
 * Created by a1 on 26.02.17.
 */
public interface Queue<E> {
    E peek(); // get from end
    void poll(E e); // put to the beginning
}
