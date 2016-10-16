package old_remove_the_same;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 08.10.16.
 */
public class MainRemover {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7}; // 1, 4, 5 - are doubled

        ArrayTheSameRemove myArrayToSameRemove = new ArrayTheSameRemove(array);

        myArrayToSameRemove.printArray(array, "Initial");

        myArrayToSameRemove.cleaningFunction();

        myArrayToSameRemove.printArray(array, "Array");
        myArrayToSameRemove.printArray(myArrayToSameRemove.getNewArray(), "Result New Array");
    }

}