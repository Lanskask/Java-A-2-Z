package buble_sort;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 30.09.16.
 */
public class BubleSorter {
    private int array[];
    private int newArray[];

    public BubleSorter(int array[]) {
        this.array = array;
    }

    private void swap(int outputArray[], int j) {
        int tempValue;
//        System.out.println("In swap method");
        tempValue = outputArray[j];
        outputArray[j] = outputArray[j+1];
        outputArray[j+1] = tempValue;
    }

    public void bubleSorting() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if( array[j] > array[j+1] ) {
                    swap(array, j);
                }
            }
        }
    }

    public void showArray(int[] array, String tag) {
        System.out.print(tag + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int[] getArray() {
        return array;
    }

    // Main Doing Neaded functions
    private void moveAllRightArrayToTheLeft(int i) {
//        System.out.println(i);
        for (; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    void cleaningFunction() {
        System.out.println("In cleaning function.");
        for (int i = 0; i < array.length - 1; i++) {
            if( array[i] == array[i + 1] ) {
//                System.out.println("array[" + i + "]=["+ i +"+1]= " + array[i]);
                moveAllRightArrayToTheLeft(i);
                array = copyOfRange(array, 0, array.length - 1 );
            }
        }
        newArray = array;
    }

    boolean check;
    void checkingArrayFunction() {
        check = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j) ) {
                    check = false;
                }
            }
        }
    }

    public boolean getCheck() {
        return check;
    }

    public int[] getNewArray() {
        return newArray;
    }
}
