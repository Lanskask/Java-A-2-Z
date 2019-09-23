package bublesort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 08.10.16.
 */
public class BubleSorterTest {

    int[] array = {2, 1, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2};
    int[] newArray;

    @Test
    public void bubleSorting() throws Exception {
        // Making start preparing
        int[] array = new int[10];

        // Making initial array
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round( Math.random()*100 );
        }

        // Starting to testing
        BubleSorter sorterClass = new BubleSorter(array);

        sorterClass.bubleSorting();
        array = sorterClass.getArray();

        // Uncomment to view the result array
        System.out.print("\n\nOutput array:\n\t ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        // Checking
        boolean check = true;
        for(int i = 0; i < array.length - 1; i++) {
            if( array[i] > array[i+1] ) {
                check = false;
            }
        }
        // Final Check
        assertTrue( check );
    }

    @Test
    public void cleaningFunction() throws Exception {
        BubleSorter sorterClassArray = new BubleSorter(array);

        sorterClassArray.showArray(array, "Before sorting");
        sorterClassArray.bubleSorting();

        sorterClassArray.cleaningFunction();

        sorterClassArray.showArray(array, "Array");

        newArray = sorterClassArray.getNewArray();
        sorterClassArray.showArray(newArray, "New Array");

        sorterClassArray.checkingArrayFunction();
        boolean check = sorterClassArray.getCheck();
        assertTrue(check);
    }

}