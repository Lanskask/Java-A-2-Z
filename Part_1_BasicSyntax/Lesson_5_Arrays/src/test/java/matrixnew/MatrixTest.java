package matrixnew;

import org.junit.Ignore;
import org.junit.Test;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by a1 on 13.10.16.
 */
public class MatrixTest {

    int matrixSize = 4;

//    boolean checkingTheEqualityOfArraysItems(int[] array1, int[] array2) {
//        boolean check = true;
//        for (int i = 0; i < array1.length; i++) {
//            if( array1[i] != array2[i]) {
//                check = false;
//            }
//        }
//        return check;
//    }

//    @Test
    @Ignore
    public void rotatingMatrix() throws Exception {

        int[] array1 = {1, 3, 4};
        int[] array2 = {2, 3, 4};
        int[] array3 = {9, 3, 4};
        int[][] array = {array1, array2, array3};
        int[] expectedArray = {4, 4, 4};

        Matrix matrix = new Matrix(array);

        matrix.showMatrix("Generated");

        int[][] getedMatrix = matrix.getMatrix();
        /*7   8   1   7
          4  10   4   2
          5   7   1   4
         10   2   9   1*/
//        int getedMatrix[][] = new int[][];
        /*int[] getedMatrix1 = {7, 8, 1, 7};
        int[] getedMatrix2 = {4, 10, 4, 2};
        int[] getedMatrix3 = {5, 7, 1, 4};
        int[] getedMatrix4 = {10, 2, 9, 1};
        int[][] getedMatrix = {getedMatrix1, getedMatrix2, getedMatrix3, getedMatrix4};

        int[] expectedArray = {7, 4, 5, 10};*/

        matrix.rotatingMatrix();
        matrix.showMatrix("After rotating");

        int[][] getedRotatedMatrix = matrix.getMatrix();
        int[] arrayUpNew = new int[3];
        for (int i = 0; i < array.length; i++) {
            arrayUpNew[i] = getedRotatedMatrix[0][i];
        }
//        assertThat(new int[]{4, 4, 4}, is(arrayUpNew) );
//        assertThat(expectedArray, is(arrayUpNew) );
//        assertThat(3, 3);
    }

}