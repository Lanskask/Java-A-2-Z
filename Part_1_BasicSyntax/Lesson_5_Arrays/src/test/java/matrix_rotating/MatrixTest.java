package matrix_rotating;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 13.10.16.
 */
public class MatrixTest {

    int matrixSize = 4;

    int[] makeRightSideArray(int[][] matrix) {
        int[] rightSideArray = new int[matrixSize];
       for (int j = 0; j < matrixSize; j++) {
            rightSideArray[j] = matrix[j][matrixSize - 1];
        }
        return rightSideArray;
    }

    int[] makeLeftSideArray(int[][] matrix) {
        int[] leftSideArray = new int[matrixSize];
        for (int j = 0; j < matrixSize; j++) {
            leftSideArray[matrixSize - j - 1] = matrix[j][0];
        }
        return leftSideArray;
    }

    int[] makeUpSideArray(int[][] matrix) {
        int[] upSideArray = new int[matrixSize];

        for (int j = 0; j < matrixSize; j++) {
            upSideArray[j] = matrix[0][j];
        }
        return upSideArray;
    }

    int[] makeDownSideArray(int[][] matrix) {
        int[] downSideArray = new int[matrixSize];

        for (int j = 0; j < matrixSize; j++) {
            downSideArray[matrixSize - j - 1] = matrix[matrixSize - 1][j];
        }
        return downSideArray;
    }

    void showArray(int[] array, String tag) {
        System.out.println(tag + " array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    boolean checkingTheEqualityOfArraysItems(int[] array1, int[] array2) {
        boolean check = true;
        for (int i = 0; i < array1.length; i++) {
            if( array1[i] != array2[i]) {
                check = false;
            }
        }
        return check;
    }

    @Test
    public void rotatingMatrix() throws Exception {


        Matrix matrix = new Matrix(matrixSize);

//        matrixSize = matrix.getMatrixSize();

        matrix.generateMatrix();
//        matrix.showMatrix("Generated");

        int[][] getedMatrix = matrix.getMatrix();

        int[] rightSideOfInitialMatrix = makeRightSideArray(getedMatrix);
        int[] leftSideOfInitialMatrix = makeLeftSideArray(getedMatrix);
        int[] upSideOfInitialMatrix = makeUpSideArray(getedMatrix);
        int[] downSideOfInitialMatrix = makeDownSideArray(getedMatrix);


        matrix.rotatingMatrix();
//        matrix.showMatrix("After rotating");

        int[][] getedRotatedMatrix = matrix.getMatrix();

        int[] rightSideOfRotatedMatrix = makeRightSideArray(getedRotatedMatrix);
        int[] leftSideOfRotatedMatrix = makeLeftSideArray(getedRotatedMatrix);
        int[] upSideOfRotatedMatrix = makeUpSideArray(getedRotatedMatrix);
        int[] downSideOfRotatedMatrix = makeDownSideArray(getedRotatedMatrix);

        /*showArray(rightSideOfInitialMatrix, "rightSideInitial");
        showArray(upSideOfRotatedMatrix, "upSideRotated");*/

        /*showArray(upSideOfInitialMatrix, "up Initial");
        showArray(leftSideOfRotatedMatrix, "left Rotated");*/

        /*showArray(leftSideOfInitialMatrix, "left Init");
        showArray(downSideOfRotatedMatrix, "Down Rotated");*/

        /*showArray(downSideOfInitialMatrix, "Down Init");
        showArray(rightSideOfRotatedMatrix, "Right Rotated");*/

        boolean checkRotatedMatrix = false;
        if (checkingTheEqualityOfArraysItems(
                rightSideOfInitialMatrix, upSideOfRotatedMatrix) &&
            checkingTheEqualityOfArraysItems(
                upSideOfInitialMatrix, leftSideOfRotatedMatrix) &&
            checkingTheEqualityOfArraysItems(
                leftSideOfInitialMatrix, downSideOfRotatedMatrix) &&
            checkingTheEqualityOfArraysItems(
                downSideOfInitialMatrix, rightSideOfRotatedMatrix) ) {
            checkRotatedMatrix = true;
        }
        assertTrue(checkRotatedMatrix);
//        assertThat(rightSideOfInitialMatrix, is(equalTo());
//        assertEquals();
    }

}