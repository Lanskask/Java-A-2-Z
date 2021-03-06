package ru.smurtazin.answers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 02.02.17.
 */
public class ConcatSortArray2Test {

    ArrayList<Integer> arrayToCompareWith =
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

    @Test
    public void concatSortArray() throws Exception {
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 5));
        ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(3, 4, 6));

        ConcatSortArray2 concatSortArray2 = new ConcatSortArray2(array1, array2);

        concatSortArray2.concatSortArray();

        assertThat(concatSortArray2.allArray, is(arrayToCompareWith));
    }

}