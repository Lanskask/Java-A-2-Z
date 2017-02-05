package ru.smurtazin.answers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by a1 on 02.02.17.
 */
public class ConcatSortArray2 {
    ArrayList<Integer> allArray =
            new ArrayList<Integer>(10);
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();

    public ConcatSortArray2(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public ArrayList<Integer> getAllArray() {
        return allArray;
    }

    void concatSortArray() {
        int i = 0, j = 0;
        for(int k = 0; k <= this.array1.size() + this.array2.size() - 1; k++ ) { // for k = 0 : allArray.size() - 1
            if (i < array1.size() && j < array2.size()) {
                if (this.array1.get(i) < this.array2.get(j)) {
                    this.allArray.add(this.array1.get(i));
                    i++;
                } else {
                    this.allArray.add(this.array2.get(j));
                    j++;
                }
            } else if (i == array1.size()) {
                this.allArray.add(this.array2.get(this.array1.size() - 1));
            } else if (j == array2.size()) {
                this.allArray.add(this.array1.get(this.array2.size()  - 1));
            }
        }
    }

    void printArrayList(ArrayList<Integer> arrayToPrint) {
        for(int arVal : arrayToPrint) {
            System.out.print(arVal + ", ");
        }
        System.out.println();
    }
}
