package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 22.02.17.
 */
public class SimpleList<E> { // extends Number

    Object[] objects;
    int index = 0;

    public SimpleList(int size) {
        this.objects = new Object[size];
    }

    public <K> K print(K value) {
        System.out.println(value);
        return value;
    }

    /*private void increaseArray() {
        Class objClass = this.objects[0].getClass();
        objClass[] newArray =
            new objClass[this.objects.length];
        for (int i = 0; i < this.objects.length; i++) {
            newArray[i] = this.objects[i];
        }
        this.objects = newArray;
    }*/

    public void add(E value) {
//        if (index+1 == objects.length) this.increaseArray();
        this.objects[index++] = value;
    }

    public E get(int position) {
        return (E) this.objects[position];
    }
}
