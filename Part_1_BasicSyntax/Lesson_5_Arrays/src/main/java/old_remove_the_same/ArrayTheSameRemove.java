package old_remove_the_same;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 08.10.16.
 */
public class ArrayTheSameRemove {
    private int array[];
    private int newArray[];

    public ArrayTheSameRemove(int array[]) {
        this.array = array;
    }

    // Prepearing functions
    int[] generateArray() {
//        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round( Math.random()*100 );
        }
        return array;
    }

    void printArray(int array[], String arrayTag) {
        System.out.print("\n" + arrayTag + " array:\n\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    // Main Doing Neaded functions
    private void moveAllRightArrayToTheLeft(int i) {
//        System.out.println(i);
        for (; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    void cleaningFunction() {
        for (int i = 0; i < array.length - 1; i++) {
            if( array[i] == array[i + 1] ) {
//                System.out.println("array[" + i + "]=["+ i +"+1]= " + array[i]);
                moveAllRightArrayToTheLeft(i);
                array = copyOfRange(array, 0, array.length - 1 );
            }
        }
        newArray = array;
    }

    public int[] getNewArray() {
        return newArray;
    }
}