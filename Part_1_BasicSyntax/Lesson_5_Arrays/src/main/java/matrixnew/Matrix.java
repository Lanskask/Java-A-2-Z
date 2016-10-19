package matrixnew;

/**
 * Created by a1 on 30.09.16.
 */

public class Matrix {

    private int matrixSize;
    private int[][] matrix;

    public int getMatrixSize() {
        return matrixSize;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int[][] outerMatrix) {
        this.matrix = outerMatrix;
        this.matrixSize = outerMatrix[0].length;
    }

    void showMatrix(String tag) {
        System.out.println(tag + " ");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    void rotatingMatrix() {
        for (int i = 0; i < matrixSize / 2; i++) { // border -> center
            for (int j = i; j < matrixSize - 1 - i; j++) { // left -> right
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][matrixSize - 1 - i];
                matrix[j][matrixSize - 1 - i] = matrix[matrixSize - 1 - i][matrixSize - 1 - j];
                matrix[matrixSize - 1 - i][matrixSize - 1 - j] = matrix[matrixSize - 1 - j][i];
                matrix[matrixSize - 1 - j][i] = tmp;
            }
        }
    }

}

