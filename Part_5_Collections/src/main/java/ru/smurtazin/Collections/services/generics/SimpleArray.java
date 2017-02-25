package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 22.02.17.
 */
public class SimpleArray<T> {

    Object[] objects;
    int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    public <K> K print(K value) {
        System.out.println(value);
        return value;
    }

    public void add(T value) {
        this.objects[index++] = value;
    }

    public void update(int index, T newValue) {
        this.objects[index] = newValue;
    }

    public void delete(int index) {
        this.objects[index] = null;
    }

    public T get(int position) {
        return (T) this.objects[position];
    }
}
