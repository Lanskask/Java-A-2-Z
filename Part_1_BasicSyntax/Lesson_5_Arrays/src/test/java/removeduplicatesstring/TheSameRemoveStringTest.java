package removeduplicatesstring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 22.10.16.
 */
public class TheSameRemoveStringTest {
    @Test
    public void removingTheSame() throws Exception {
        String[] stringArray = {"aa", "bbb", "cbadf", "bbb", "bbb", "aa", "cbadf", "aa", "bbb", "aa", "bbb", "aa"};
        String[] expectedStringArray = {"aa", "bbb", "cbadf"};
        TheSameRemoveString myTheSameRemoveStringArray = new TheSameRemoveString(stringArray);

        myTheSameRemoveStringArray.removingTheSame();

        assertArrayEquals(expectedStringArray, myTheSameRemoveStringArray.getArray());
    }

}