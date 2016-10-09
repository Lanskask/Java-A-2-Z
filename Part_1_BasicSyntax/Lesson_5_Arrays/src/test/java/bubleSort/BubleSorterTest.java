package bubleSort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 08.10.16.
 */
public class BubleSorterTest {
    @Test
    public void bubleSorting() throws Exception {
      // Making start preparing
        int[] array = new int[10];

        // Making initial array
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round( Math.random()*100 );
        }

      // Starting to testing
        BubleSorter sorter = new BubleSorter(array);

        array = sorter.getArray();


//        Uncomment to view the result array
        /*System.out.print("\n\nOutput array:\n\t ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }*/

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

}