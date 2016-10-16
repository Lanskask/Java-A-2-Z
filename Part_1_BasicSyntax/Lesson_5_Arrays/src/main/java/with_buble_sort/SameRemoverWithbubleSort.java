package with_buble_sort;

//import bubleSort.*;
import buble_sort.BubleSorter;
//import bubleSort.BubleSorter;

/**
 * Created by a1 on 13.10.16.
 */
public class SameRemoverWithbubleSort {
    //    int[] array = {1, 0, 1, 1, 0};
    int[] array = {2, 1, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2};

//    BubleSorter sorter = new BubleSorter(array);
//    bubleSort.BubleSorter sorter = new bubleSort.BubleSorter(array);

    BubleSorter sorter = new BubleSorter(array);
//    sorter.bubleSorting();
    int[] resultArray = sorter.getArray();
//    sorter();
}
