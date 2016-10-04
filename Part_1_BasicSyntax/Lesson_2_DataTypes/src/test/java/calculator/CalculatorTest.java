package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 04.10.16.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        calculator.add(4, 2);

        assertEquals( 6, (int) calculator.getResult());
    }

    @Test
    public void substruct() throws Exception {
        Calculator calculator = new Calculator();

        calculator.substruct(4, 2);

        assertEquals( (int) 2.0, (int) calculator.getResult());
    }

    @Test
    public void multiple() throws Exception {
        Calculator calculator = new Calculator();

        calculator.multiple(4, 2);

        assertEquals( 8, (int) calculator.getResult());
    }

    @Test
    public void div() throws Exception {
        Calculator calculator = new Calculator();

        calculator.div(4, 2);

        assertEquals( 2, (int) calculator.getResult());
    }
}