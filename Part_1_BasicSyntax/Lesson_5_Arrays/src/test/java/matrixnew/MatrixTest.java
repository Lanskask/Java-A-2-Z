package matrixnew;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 13.10.16.
 */
public class MatrixTest {

    @Test
    public void rotatingMatrix() throws Exception {

        int[][] array = {
                {1, 3, 4},
                {2, 3, 4},
                {9, 3, 4}   };
        int[] expectedArray = {4, 4, 4};

        Matrix matrix = new Matrix(array);

        matrix.rotatingMatrix();

        int[][] getedRotatedMatrix = matrix.getMatrix();

        int[] arrayUpNew = new int[3];
        for (int i = 0; i < arrayUpNew.length; i++) {
            arrayUpNew[i] = getedRotatedMatrix[0][i];
        }

        assertThat(expectedArray, is(arrayUpNew) );
    }

}