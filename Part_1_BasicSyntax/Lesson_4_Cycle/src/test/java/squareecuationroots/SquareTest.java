package squareecuationroots;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertArrayEquals;

/**
 * Created by a1 on 09.10.16.
 */
public class SquareTest {
    @Test
    public void solvEquation() throws Exception {
        Square mySquare = new Square(-9, 2, 1);

        double[] xAnswers = mySquare.solvEquation();

//        assert
        assertArrayEquals(new double[]{ -8.3, 4.3},xAnswers , 0.1);
    }

}