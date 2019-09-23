package squareequationnew;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

/**
 * Created by 1 on 19.10.2016.
 */
public class SquareTest {
    @Test
    public void show() throws Exception {

        Square myNewSquare = new Square(-9, 2, 1);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        myNewSquare.show(1.0, 4.0, 0.5);
        assertThat(out.toString(), is("-6.0, -16.25, -31.0, -50.25, -74.0, -102.25, "));
    }

}