package ru.smurtazin.Collections.services.list;

/**
 * Created by a1 on 02.03.17.
 *
 * Taken from Robert Lafore Data Structures and Algorithms p.190
 */
public class Link {
    public int index;
    public Object element;
    public Link next;

    public Object getElement() {
        return element;
    }

    public Link(int index, Object o) {
        this.index = index;
        this.element = o;
    }

    public void displayLink() {
        System.out.print(
                "{" + this.index + ", " + this.element + "} ");
    }
}
