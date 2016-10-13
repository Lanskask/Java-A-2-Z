package matrixRotating;

/**
 * Created by a1 on 30.09.16.
 */

public class Matrix {

    private int matrixSize;
    private int[][] matrix;

/*    public void setMatrixSize(int matrixSize) {
        this.matrixSize = matrixSize;
    }*/

    public int getMatrixSize() {
        return matrixSize;
    }

    public int[][] getMatrix() {
        return matrix;
    }

//    public Matrix(int matrixSize) {
//        this.matrix[matrixSize][matrixSize] = matrix[matrixSize][matrixSize];
//    }

    public Matrix(int matrixSize) {
        this.matrix = new int[matrixSize][matrixSize];
        this.matrixSize = matrixSize;
    }

    void generateMatrix() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
            }
        }
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



//        Rotating
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

