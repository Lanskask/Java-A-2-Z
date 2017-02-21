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

    // --- Constructors -------
    public IteratorsIterator(int[][] values ) {
        this.values = values;
    }

    public IteratorsIterator() {}

    // --- Little needed functions ----------
    public boolean hasNext() {
        return values.length > index+1;
    }

    public Object next() {
        return values[index++];
    }

    public void remove() {} // Needed cause of implementation

    // ------ My Realisation ------------
    private int fullArraySize(int[][] fullArray) {
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

    // TODO: Test this
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> iterator) {
        ListIterator<Integer> iteratorToReturn = new ArrayList<Integer>().listIterator();

        for (int i = 0; i < this.size(iterator); i++) {
            Iterator<Integer> bigIterPart = iterator.next();
            for (int j = 0; j < this.size(bigIterPart); j++) {
                iteratorToReturn.add(bigIterPart.next());
            }
        }

        return iteratorToReturn;
    }

    public Iterator<Integer> convert2(Iterator<Iterator<Integer>> iterator) {
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
}
