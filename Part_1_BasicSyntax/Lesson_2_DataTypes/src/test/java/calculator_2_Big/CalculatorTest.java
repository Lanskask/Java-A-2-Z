package calculator_2_Big;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 01.10.16.
 */
public class CalculatorTest {

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
//        System.out.println("Test Add Result: " +
//                        calculator.getResult());

//        assertEquals( 2, calculator.getResult());
        assertEquals( 2, calculator.getResult());
//        calculator.cleanResult();
    }

    //    //  substruct div multiple
    @Test
    public void substruct() throws Exception {
        Calculator calculator = new Calculator();

        calculator.substruct(2, 1);
        System.out.println("Test Substract Result: " +
                calculator.getResult());
        assertEquals(1, calculator.getResult());
//        calculator.cleanResult();

    }

    @Test
    public void multiple() throws Exception {
        Calculator calculator = new Calculator();

        calculator.multiple(2, 3);
        System.out.println("Test Multiply Result: " +
                calculator.getResult());
        assertEquals(6, calculator.getResult());
//        calculator.cleanResult();

    }

    @Test
    public void div() throws Exception {
        Calculator calculator = new Calculator();

        calculator.div(4, 2);
        System.out.println("Test Div Result: " +
                calculator.getResult());
        assertEquals(2, calculator.getResult());
    }

}