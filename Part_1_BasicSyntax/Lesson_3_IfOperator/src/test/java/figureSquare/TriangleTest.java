package figureSquare;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 08.10.16.
 */
public class TriangleTest {
    // Fields
    Point a = new Point(0, 0);
    //    Point a = new Point(0, 3);
    Point b = new Point(0, 3);
    Point c = new Point(4, 0);

    Triangle myTriangle = new Triangle(a, b, c);

    // Methods testing
    @Test
    public void area() throws Exception {
        myTriangle.area();

        assertTrue( 6D == myTriangle.getArea());
    }

    @Test
    public void maxLength() throws Exception {
        myTriangle.maxLength();
        assertTrue(5D == myTriangle.getMaxLength());
    }

}