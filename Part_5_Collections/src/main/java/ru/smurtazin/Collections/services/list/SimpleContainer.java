package ru.smurtazin.Collections.services.list;

import java.util.List;

/**
 * Created by a1 on 26.02.17.
 */
public interface SimpleContainer<E> extends Iterable<E> {
    void add(E e);
    E get(int index);
}
