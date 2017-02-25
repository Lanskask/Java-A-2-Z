package ru.smurtazin.Collections.services.generics;

import java.lang.reflect.ParameterizedType;

/**
 * Created by a1 on 22.02.17.
 */
public class SimpleArray<T> { // extends Number

    Object[] objects;
    int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];

        /*Class<T> t = (Class<T>) (
                (ParameterizedType)
                        getClass().getGenericSuperclass()
        ).getActualTypeArguments()[0]; //.getClass();

        try {
            T value = t.newInstance();
//            System.out.printf("string " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public <K> K print(K value) {
        System.out.println(value);
        return value;
    }

    // TODO or not todo
    /*private void increaseArray() {
        Class objClass = this.objects[0].getClass();
        objClass[] newArray =
            new objClass[this.objects.length];
        for (int i = 0; i < this.objects.length; i++) {
            newArray[i] = this.objects[i];
        }
        this.objects = newArray;
    }*/

    public void add(T value) {
//        if (index+1 == objects.length) this.increaseArray();
        this.objects[index++] = value;
    }

    // TODO: test
    public void update(int index, T newValue) {
        this.objects[index] = newValue;
    }

    // TODO: test
    public void delete(int index) {
        this.objects[index] = null;
    }

    public T get(int position) {
        return (T) this.objects[position];
    }
}
