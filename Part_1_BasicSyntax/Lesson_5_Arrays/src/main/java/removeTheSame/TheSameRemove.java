package removeTheSame;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 12.10.16.
 */
public class TheSameRemove {
    private int array[];
    private int newArray[];
    private boolean check;

    public int[] getArray() {
        return array;
    }
    public int[] getNewArray() {
        return newArray;
    }
    public boolean getCheck() {
        return check;
    }

    public TheSameRemove(int array[]) {
        this.array = array;
    }

    void printArray(int array[], String arrayTag) {
        System.out.print("\n" + arrayTag + " array:\n\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    void printArrayInLine(int array[], String arrayTag) {
        System.out.print(arrayTag + " array:\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    void checkingArrayInUniqeItems() {
        check = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j) ) {
                    check = false;
                }
            }
        }
    }

    void removeIElement(int i) {
        for (; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array = copyOfRange(array, 0, array.length - 1 );
    }


    void removingTheSame() {

        while(!check) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[j] == array[k] && (j != k)) {
//                        System.out.println("array[" + j + "] = " + array[j] + " " +
//                                "and array[" + k + "] = " + array[k]);

                        removeIElement(k);
//                        printArrayInLine(array, "");
                    }

                    System.out.println("j: " + j + "; k: " + k);
                }
            }
            this.checkingArrayInUniqeItems();
        }
    }

    void removingInTheSameArray() {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == copyOfRange(array, i + 1, array.length)[j] ) {
                    System.out.println("array[" + i + "] = " + array[i] + " " +
                            "and array[" + j + "] = " + array[j]);

                    removeIElement(j);

                    printArrayInLine(array, "");
                }
            }
        }
    }

}
