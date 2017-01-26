package ru.smurtazin.answers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 26.01.17.
 */
public class ConcatSortArrayTest {

    ArrayList<Integer> arrayToCompareWith = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    @Test
    public void sortAllArray() throws Exception {
        ConcatSortArray concatSortArray = new ConcatSortArray();

        concatSortArray.sortAllArray();

        assertThat(concatSortArray.allArray, is(arrayToCompareWith));
    }

}