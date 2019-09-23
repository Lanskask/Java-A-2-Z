package factorial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 04.10.16.
 */
public class FactorialTest {
    @Test
    public void makeFactorial() throws Exception {
        Factorial factorial = new Factorial();

        factorial.makeFactorial(5);
        assertEquals( 120, factorial.getFactorizedNumber());
    }

}