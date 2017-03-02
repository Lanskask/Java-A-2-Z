package ru.smurtazin.Collections.services.list;

import java.util.Iterator;

/**
 * Created by a1 on 02.03.17.
 */
public class DynamicArray<T> implements SimpleContainer {

//    Object[] array = new Object[10];
    Object[] array;
    Object[] newArray;
    int nowArraySize;
    int index = 0;

    public DynamicArray() { }

    public DynamicArray(Object[] array) {
        this.array = array;
    }

    public DynamicArray(int size) {
        this.array = new Object[size];
        this.nowArraySize = size;
    }

    public int numberOfEllements() {
        int size = 0;
        for (Object obj : this.array) {
            if (obj != null)
                size++;
        }
        return size;
    }

    public void increaseArraySize() {
        this.newArray = new Object[this.array.length + this.array.length / 2];

        for (int i = 0; i < this.array.length - 1; i++) {
            this.newArray[i] = this.array[i]; // Copping of all old array to the new one
        }
        this.array = this.newArray;
    }

    public void add(Object element) {
        System.out.println("length: " + this.array.length + "; index: " + index + "; elem: " + element);

        if (this.array.length == this.index) {
            this.increaseArraySize();
//            System.out.println("ArrLen In: " + this.array.length);
            System.out.println("ind: " + this.index);
//            this.index++;
            this.array[this.index++] = element;
            System.out.println("length: " + this.array.length + "; index: " + index + "; elem: " + element);
        } else {
            this.array[index++] = element;
        }
    }

    public T get(int index) {
        return (T) this.array[index];
    }

    public void printAll() {
        for (Object element : this.array) {
//            if (element != null)
                System.out.print( (T) element + ", ");
        }
        System.out.println();
    }

    public Iterator iterator() { // needed for implementation
        return null;
    }
}
