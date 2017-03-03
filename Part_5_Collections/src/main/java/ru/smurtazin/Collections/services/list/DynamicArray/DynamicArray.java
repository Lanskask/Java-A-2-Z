package ru.smurtazin.Collections.services.list.DynamicArray;

import java.util.Iterator;

/**
 * Created by a1 on 02.03.17.
 */
public class DynamicArray<T> implements SimpleContainer {

    public Object[] array;
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
        // TODO i'm not sure here sould be - 1
        this.newArray = new Object[this.array.length + this.array.length / 2 - 1];

        for (int i = 0; i < this.array.length; i++) {
            this.newArray[i] = this.array[i]; // Copping of all old array to the new one
        }
        this.array = this.newArray;
    }

    public void add(Object element) {
        if (this.array.length == this.index) {
            this.increaseArraySize();
            this.array[this.index++] = element;
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
