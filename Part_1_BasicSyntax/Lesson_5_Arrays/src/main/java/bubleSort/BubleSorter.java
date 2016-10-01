package bubleSort;

/**
 * Created by a1 on 30.09.16.
 */
public class BubleSorter {
    private int array[];

    public BubleSorter(int array[]) {
        this.array = array;
    }

//    private void swap(int firstValue, int secondValue) {
    private void swap(int outputArray[], int j) {
        int tempValue;
//        System.out.println("In swap method");
//        System.out.println(firstValue + " " + secondValue);
        tempValue = outputArray[j];
        outputArray[j] = outputArray[j+1];
        outputArray[j+1] = tempValue;
//        System.out.println(firstValue + " " + secondValue);
    }

    public int[] bubleSorting() {
        int outputArray[] = array;

        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < outputArray.length - 1; j++) {
                if( outputArray[j] > outputArray[j+1] ) {
                    swap(outputArray, j);
                }
            }
        }

        return outputArray;
    }
}
