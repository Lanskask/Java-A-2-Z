package matrixnew;

/**
 * Created by a1 on 30.09.16.
 */

public class Matrix {

    private int matrixSize;
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int[][] outerMatrix) {
        this.matrix = outerMatrix;
        this.matrixSize = outerMatrix[0].length;
    }

    void rotatingMatrix() {
        for (int i = 0; i < matrixSize / 2; i++) {
            for (int j = i; j < matrixSize - 1 - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][matrixSize - 1 - i];
                matrix[j][matrixSize - 1 - i] = matrix[matrixSize - 1 - i][matrixSize - 1 - j];
                matrix[matrixSize - 1 - i][matrixSize - 1 - j] = matrix[matrixSize - 1 - j][i];
                matrix[matrixSize - 1 - j][i] = tmp;
            }
        }
    }
}

