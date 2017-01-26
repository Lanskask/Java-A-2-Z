package ru.smurtazin.answers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by a1 on 25.01.17.
 */
public class ConcatSortArray {

    ArrayList<Integer> newList = new ArrayList<Integer>();

    ArrayList<Integer> allArray = new ArrayList<Integer>();
    ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));

    ConcatSortArray() {
        this.makeAllArray();
    }

    void makeAllArray() {
        this.allArray.addAll(array1);
        this.allArray.addAll(array2);
    }

    void printArrayList(ArrayList<Integer> arrayToPrint) {
        for(int arVal : arrayToPrint) {
            System.out.print(arVal + ", ");
        }
        System.out.println();
    }

    void swMoRigh(int i, int j) { // Swap ar[j] and ar[i] and move all to the right of ar[i]
        int temp;
        // allArray[j] -> temp
        temp = this.allArray.get(j);
        for(int k = 0; k <= j-i; k++ ) {
            // allArray[j-k-1] -> allArray[j-k];
            this.allArray.set(j-k, allArray.get(j-k-1) );
        }
        // temp -> allArray[i];
        this.allArray.set(i, temp );
    }

    void sortAllArray(){
        int half = this.allArray.size() / 2;
        for(int i = 1; i < half+1; i++) {
            if  (
                    this.allArray.get(half + i-1) > this.allArray.get(i-1)
                    &&
                    this.allArray.get(half + i-1) < this.allArray.get(i+i-1)
                 ) {
                this.swMoRigh(i*2-1, half+i-1);
            }
        }
    }

    ArrayList<Integer> concatAndSortArrays(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
//    void concatAndSortArrays(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>();
        arrayToSort.addAll(arrayList1);
        arrayToSort.addAll(arrayList2);
        this.printArrayList(arrayToSort);

        int temp;
        int halfAr = arrayToSort.size() / 2;
        for (int i = 0; i <= halfAr-1 ; i++) {
            if (arrayToSort.get(i) < arrayToSort.get(i + halfAr )) { //&&
                if (arrayToSort.get(i + 1) > arrayToSort.get(i + halfAr )) {

                    temp = arrayToSort.get(i + 1);
                    arrayToSort.set(i + 1, arrayToSort.get(i + halfAr));
                    arrayToSort.set(i + halfAr, arrayToSort.get(i + 2));
                    arrayToSort.set(i + 2, temp);

                    this.printArrayList(arrayToSort);
                }
            }
        }
        return arrayToSort;
    }

    public static void main(String[] args) {
        ConcatSortArray concatSortArray = new ConcatSortArray();

        concatSortArray.sortAllArray();

        concatSortArray.printArrayList(concatSortArray.allArray);

        /*ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));

        concatSortArray.printArrayList(
                concatSortArray.concatAndSortArrays(arrayList1, arrayList2)
        );*/
    }


}
