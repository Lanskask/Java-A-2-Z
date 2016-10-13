package removeTheSame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 12.10.16.
 */
public class TheSameRemoveTest {

//    int[] array = {1, 0, 1, 1, 0};
    int[] array = {2, 1, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2};
    int[] newArray;
    TheSameRemove myTheSameRemoveArray = new TheSameRemove(array);

    @Test
    public void checkingArrayFunction() throws Exception {
        myTheSameRemoveArray.checkingArrayInUniqeItems();
        myTheSameRemoveArray.printArray(array, "Before Sorting");


//        myTheSameRemoveArray.moveArrayToTheLeft(1);
        myTheSameRemoveArray.removingTheSame();
//        myTheSameRemoveArray.toCleanAgain();

//        myTheSameRemoveArray.removingInTheSameArray();

//        newArray = myTheSameRemoveArray.getNewArray();
        newArray = myTheSameRemoveArray.getArray();
        myTheSameRemoveArray.printArray(newArray, "After Sorting");

        boolean check = myTheSameRemoveArray.getCheck();

        assertTrue( check );
    }

}