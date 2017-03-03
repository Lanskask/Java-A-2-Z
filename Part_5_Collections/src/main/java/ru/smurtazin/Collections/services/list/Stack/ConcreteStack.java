package ru.smurtazin.Collections.services.list.Stack;

/**
 * Created by a1 on 02.03.17.
 *
 * Taken from Robert Lafore Data Structures and Algorithms p.126
 */
public class ConcreteStack implements Stack {

    private int maxSize;
    private Object[] stackArray;
    private int top;

    public ConcreteStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object o) { // Положить в массив
        stackArray[++top] = o;
    }

    public Object poll() { // Вынуть из массива // Было - pop
        return stackArray[top--];
    }

    public Object peek() { // Узнать (но не вынуть) эллемент из массива
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

}
