package substringfinder;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by 1 on 20.10.2016.
 */
public class SubstringfinderTest {
    @Test
    public void contains() throws Exception {
        Substringfinder myStrings = new Substringfinder();

        String bigString = "Hello, World!";
        String subString = "World";

        assertThat(myStrings.contains(bigString, subString), is(true));
    }

}