package figureSquare;

import experiments.ClassA;
import experiments.ClassB;
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

    double[] sidesArray = {myTriangle.ABSideLength, myTriangle.BCSideLength, myTriangle.CASideLength};

    // Methods testing
    @Test
    public void area() throws Exception {
        myTriangle.triangleExistionByAngles();
        myTriangle.area();
        assertEquals( 6D, myTriangle.getArea(), 0.05);
    }

    @Test
    public void maxLength() throws Exception {
        myTriangle.maxLength();
        assertTrue(5D == myTriangle.getMaxLength());
    }


    @Test
    public void getNearPointAngle() throws Exception {
        int i = 0;
        int[] allNumbers = myTriangle.allNumbersArray(sidesArray.length);
        int[] numberOfNeededPoints = myTriangle.arrayWithRemovedIElement(allNumbers, i);
        double angleSize = myTriangle.getNearPointAngle(numberOfNeededPoints,i);
//        System.out.println("angleSize: " + angleSize);
        assertEquals(36.86989764584402129686, angleSize, 0.05);
    }

    @Test
    public void allAnglesSize() throws Exception {
//        System.out.println("allAnglesSize: " + myTriangle.allAnglesSize());
        assertEquals(180, myTriangle.allAnglesSize(), 1);
    }
}