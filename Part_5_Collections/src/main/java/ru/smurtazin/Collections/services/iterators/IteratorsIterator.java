package ru.smurtazin.Collections.services.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by a1 on 21.02.17.
 */
public class IteratorsIterator implements Iterator {

    // --- Fields -------
    private int[][] values;
    private int position = 0; // needed for arrays
    private int index = 0;
    Iterator<Iterator<Integer>> iteratorsIterator;

    // --- Constructors -------
    public IteratorsIterator() {}

    public IteratorsIterator(int[][] values ) {
        this.values = values;
    }

    public IteratorsIterator(Iterator<Iterator<Integer>> iteratorsIterator) {
        this.iteratorsIterator = iteratorsIterator;
    }

    // --- Little needed functions ----------
    public boolean hasNext() {
        return values.length > index+1;
    }

    public Object next() {
        return values[index++];
    }

    public void remove() {} // Needed cause of implementation

    // ------ My Realisation ------------
    public int fullArraySize(int[][] fullArray) {
        int fullArraySize = 0;
        for (int[] bigArrayPart : fullArray) {
            fullArraySize += bigArrayPart.length;
        }
        return fullArraySize ;
    }

    public int[] convertArrays(int[][] fullArray) {
        int[] iteratorToReturn = new int[this.fullArraySize(fullArray)];

        for (int[] bigArrayPart : fullArray ){
            for (int num : bigArrayPart  ){
                iteratorToReturn[position++] = num;
            }
        }

        return iteratorToReturn;
    }

    public int[] convertArraysWValues() {
        int[] iteratorToReturn = new int[this.fullArraySize(this.values)];

        for (int[] bigArrayPart : this.values ){
            for (int num : bigArrayPart  ){
                iteratorToReturn[position++] = num;
            }
        }

        return iteratorToReturn;
    }

    // --------- For iterators ------------
    private int size(Iterator iterator) {
        int i = 0;
        for ( ; iterator.hasNext() ; ++i ) iterator.next();

//        return Lists.newArrayList(iterator).size();
        return i + 1;
    }

    public Iterator<Integer> convert(Iterator<Iterator<Integer>> iterator) {
        ListIterator<Integer> iteratorToReturn = new ArrayList<Integer>().listIterator();

        System.out.println("In convert 1"); // TODO: Remove
        System.out.println(this.size(iterator)); // TODO: Remove
        System.out.println("iterator.next().getClass: " + iterator.next().getClass()); // TODO: Remove

        for (int i = 0; i < this.size(iterator); i++) {
            Iterator<Integer>
                    bigIterPart = iterator.next();
            System.out.println("In convert 2"); // TODO: Remove
            for (int j = 0; j < this.size(bigIterPart); j++) {
                iteratorToReturn.add(bigIterPart.next());
                System.out.println("In convert 3"); // TODO: Remove
            }
        }

        return iteratorToReturn;
    }

    public Iterator<Integer> convertThis() {
        ListIterator<Integer> iteratorToReturn = new ArrayList<Integer>().listIterator();

        for (int i = 0; i < this.size(this.iteratorsIterator); i++) {
            Iterator<Integer> bigIterPart = this.iteratorsIterator.next();
            for (int j = 0; j < this.size(bigIterPart); j++) {
                iteratorToReturn.add(bigIterPart.next());
            }
        }

        return iteratorToReturn;
    }



    public Iterator<Integer> convertArray2(Iterator<Iterator<Integer>> iterator) {
        ListIterator<Integer> iteratorToReturn = new ArrayList<Integer>().listIterator();

        for (int i = 0; iterator.hasNext(); i++) {
            Iterator<Integer> bigIterPart = iterator.next();
            for (int j = 0; bigIterPart.hasNext(); j++) {
                bigIterPart.next();
                iteratorToReturn.add(bigIterPart.next());
            }
        }

        return iteratorToReturn;
    }

    public void printIteratorsIterator(Iterator<Iterator<Integer>> iteratorsIterator) {
        for (int i = 0; iteratorsIterator.hasNext(); i++) {
            Iterator<Integer> bigIterPart = iteratorsIterator.next();
            for (int j = 0; bigIterPart.hasNext(); j++) {

                System.out.println(bigIterPart.next());
            }
        }
    }

    public void printIterator(Iterator<Integer> iterator) {
        for (int i = 0; iterator.hasNext(); i++) {
                System.out.print(iterator.next() + ", ");
        }
//        System.out.println(); // TODO: Uncomment
    }

    public void printThisIterator() {
        for (int i = 0; this.iteratorsIterator.hasNext(); i++) {
            Iterator<Integer> bigIterPart = this.iteratorsIterator.next();
            for (int j = 0; bigIterPart.hasNext(); j++) {
                System.out.print(bigIterPart.next() + ", ");
            }
//            System.out.println(); // TODO: Uncomment
        }
    }
}
