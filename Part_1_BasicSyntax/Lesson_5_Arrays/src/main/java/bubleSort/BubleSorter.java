package bubleSort;

/**
 * Created by a1 on 30.09.16.
 */
public class BubleSorter {
    private int array[];

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

    public int[] getArray() {
        return array;
    }
}
