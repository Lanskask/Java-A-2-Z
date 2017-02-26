package ru.smurtazin.Collections.services.iterators;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 21.02.17.
 */
public class IteratorsIteratorTest {

    int[] intArray1 = {4, 2, 0, 4, 6, 4, 9}; // 7
    int[] intArray2 = {0, 9, 8, 7, 5}; // 5
    int[] intArray3 = {1, 3, 5, 6, 7, 0, 9, 8, 4}; // 9
    int[][] arrayOfArrays = {intArray1, intArray2, intArray3}; // 21

    int[] arrayToCheck = { // don't delete. It is used
            4, 2, 0, 4, 6, 4, 9,
            0, 9, 8, 7, 5,
            1, 3, 5, 6, 7, 0, 9, 8, 4
    };

    //    Iterator<Iterator<Integer>> myIteratorInst =
        IteratorsIterator myIteratorInst = new IteratorsIterator(arrayOfArrays);
    IteratorsIterator myIterator = new IteratorsIterator();

    Iterator<Integer> iterator1 = new IteratorArray( new int[]{4, 2, 0, 4, 6, 4, 9}); // 7
    Iterator<Integer> iterator2 = new IteratorArray( new int[]{0, 9, 8, 7, 5}); // 5
    Iterator<Integer> iterator3 = new IteratorArray( new int[]{1, 3, 5, 6, 7, 0, 9, 8, 4}); // 9

    // TODO: How to initialize Iterator of Iterators
//    Iterator<Iterator<Integer>> iteratorsIterator = new IteratorArray(iterator1, iterator2, iterator3);
//    Iterator<Iterator<Integer>> iteratorsIterator = {iterator1, iterator2, iterator3}.iterator();

    @Ignore
    @Test // Tested
    public void convertArrays() throws Exception {
        assertThat(arrayToCheck, is(myIterator.convertArrays(arrayOfArrays)));
    }

    @Ignore
    @Test // Tested
    public void convertArraysWValues() throws Exception {
        assertThat(arrayToCheck, is(myIteratorInst.convertArraysWValues()));
    }

    @Ignore
    @Test
    public void convertArray_Test() throws Exception {

    }

    @Ignore
    @Test
    public void convertArray2_Test() throws Exception {

    }

    @Ignore
    @Test
    public void wildTest_addToIterators() throws Exception {
        // ------ Asign ------------
        // from http://www.codescream.com/ContentDisplay?targetContent=RoundRobinIterator
        // Create 5 sample lists
        List<Integer> a = new LinkedList<Integer>(Arrays.asList(4, 2, 0, 4, 6, 4, 9));
        List<Integer> b = new LinkedList<Integer>(Arrays.asList(0, 9, 8, 7, 5));
        List<Integer> c = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 6, 7, 0, 9, 8, 4));

        // Create a list of the iterators to each above
        List<Iterator<Integer>> iterators = new LinkedList< Iterator<Integer>>();
        iterators.add(a.iterator());
        iterators.add(b.iterator());
        iterators.add(c.iterator());

        // converting iterators list to iterator of iterators
        // TODO: Couse it's just iterator which is made from 1 list,
        // TODO:    that's why there is only one item in this iterator
        Iterator<Iterator<Integer>> iteratorsIterator = iterators.iterator();

        List<Integer> listToCheck = new LinkedList<Integer>(Arrays.asList(
                4, 2, 0, 4, 6, 4, 9,
                0, 9, 8, 7, 5,
                1, 3, 5, 6, 7, 0, 9, 8, 4
        ));
        Iterator<Integer> iteratorToCheck = listToCheck.iterator();
        IteratorsIterator myIteratorsIterator = new IteratorsIterator(iteratorsIterator);

        // ------- Act -------- // Unneedn't
        System.out.println("myIteratorsIterator.printThisIterator: ");
        myIteratorsIterator.printThisIterator();

        // ------- Assert -------

        myIteratorsIterator.printIterator(myIteratorsIterator.convert( iteratorsIterator ));
//        assertThat(iteratorToCheck, is(myIteratorsIterator.convert( iteratorsIterator )));

    }

    @Ignore
    @Test
    public void wildTest_ConvertFromArrayArray() throws Exception {
//        Iterator<Iterator<Integer>> iteratorToTest =
        IteratorsIterator iteratorToTest = new IteratorsIterator(arrayOfArrays);

        Iterator<Integer> bigIterator = new IteratorArray(arrayToCheck);

//        assertThat(iteratorToTest, is(iteratorToTest.convert( iterator3 )));

//        convert( Iterator<Iterator<Integer>> iteratorOfIterators) == Iterator<Integer> bigIterator
//        assertThat(bigIterator, is(iteratorToTest.convert( iteratorToTest )));
        assertThat(bigIterator, is(iteratorToTest.convertThis()));

    }

}