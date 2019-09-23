package ru.smurtazin.Collections.services.list.LinkedList;

/**
 * Created by a1 on 02.03.17.
 *
 * Taken from Robert Lafore Data Structures and Algorithms p.190
 */
public class LinkedList {
    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (this.first==null);
    }

    public void insertFirst(int index, Object element) {
        Link newLink = new Link(index, element);
        newLink.next = this.first;
        this.first = newLink;
    }

    public Link deleteFirst() {
        Link temp = this.first;
        this.first = this.first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = this.first; // От начала списка

        while(current != null) { // Перемещение до конца списка
            current.displayLink();  // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public Link find(int key) {
        Link current = first;

        while(current.index != key) {
            if(current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }

        return current;
    }

    public Link delete(int key) {
        Link current = this.first;

        Link previous = this.first;
        while(current.index != key)
        {
            if(current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }

        if(current == this.first) {
            this.first = this.first.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }

}
