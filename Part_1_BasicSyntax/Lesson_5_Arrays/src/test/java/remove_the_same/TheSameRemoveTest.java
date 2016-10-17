package remove_the_same;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 12.10.16.
 */
public class TheSameRemoveTest {

//    int[] array = {1, 0, 1, 1, 0};


    @Test
    public void checkingArrayFunction() throws Exception {

        int[] array = {2, 1, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2};
        int[] newArray;

        TheSameRemove myTheSameRemoveArray = new TheSameRemove(array);

        myTheSameRemoveArray.checkingArrayInUniqeItems();
        myTheSameRemoveArray.removingTheSame();

        newArray = myTheSameRemoveArray.getArray();

        int[] expectedArray = {2, 0, 1};
        assertArrayEquals(expectedArray, newArray);
    }

}