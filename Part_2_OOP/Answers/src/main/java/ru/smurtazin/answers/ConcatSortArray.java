package ru.smurtazin.answers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by a1 on 25.01.17.
 */
public class ConcatSortArray {

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
        temp = this.allArray.get(j); // allArray[j] -> temp
        for(int k = 0; k <= j-i; k++ ) {
            this.allArray.set(j-k, allArray.get(j-k-1) ); // allArray[j-k-1] -> allArray[j-k];
        }
        this.allArray.set(i, temp ); // temp -> allArray[i];
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

}
