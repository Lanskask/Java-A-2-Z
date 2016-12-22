package jdbc;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by a1 on 22.12.16.
 */
public class UserInputTest {
    /*@Test
    public void main2() throws Exception {
        UserInput usInput = new UserInput();

    }*/

    /*@Before
    public void setUp() {
        UserInput usInput = new UserInput();
    }*/

    @Test
    public void makeStringTaskID() throws Exception {
        fail("Not implemented.");
    }


    @Test
    public void askAndWriteTaskID() throws Exception {
        UserInput usInput = new UserInput();
        /*String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);*/

        System.setIn(new ByteArrayInputStream( "5".getBytes()) );
//        String outputToChek = "Your id is: 5";
        assertEquals( "task_id: 5", usInput.makeStringTaskID());
    }

}