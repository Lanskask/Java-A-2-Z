package removeduplicatesint;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 12.10.16.
 */
public class TheSameRemoveTest {

    @Test
    public void checkingArrayFunction() throws Exception {
        int[] array = {2, 1, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2};
        int[] expectedArray = {2, 1, 0};
        TheSameRemove myTheSameRemoveArray = new TheSameRemove(array);

//        myTheSameRemoveArray.checkingArrayInUniqeItems();
        myTheSameRemoveArray.removingTheSame();

        assertArrayEquals(expectedArray, myTheSameRemoveArray.getArray());
    }

}