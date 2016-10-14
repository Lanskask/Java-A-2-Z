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

    //    Point(double x, double y)
    //    Vector(Point A, Point B)

    /*ClassA b1 = new ClassA(3, 4);
    ClassA b2 = new ClassA(2, 1);

    ClassB c1 = new ClassB(b1, b2);
    ClassB c2 = new ClassB(b1, b2);*/

    double[] sidesArray = {myTriangle.ABSideLength, myTriangle.BCSideLength, myTriangle.CASideLength};

    // Methods testing
    /*@Test
    public void area() throws Exception {
        myTriangle.area();

        assertTrue( 6D == myTriangle.getArea());
    }*/

    /*@Test
    public void maxLength() throws Exception {
        myTriangle.maxLength();
        assertTrue(5D == myTriangle.getMaxLength());
    }*/

//
    @Test
    public void getNearPointAngle() throws Exception {
//        myTriangle.showArray(sidesArray, "sidesArray lengths");

        int i = 1;
        int[] allNumbers = myTriangle.allNumbersArray(sidesArray.length);
        /*myTriangle.showArray(allNumbers, "All Numbers");*/

        int[] numberOfNeededPoints = myTriangle.arrayWithRemovedIElement(allNumbers, i);
        /*myTriangle.showArray(numberOfNeededPoints, "Needed points");*/

        double angleSize = myTriangle.getNearPointAngle(numberOfNeededPoints,i);
//        assertEquals(60, angleSize, 5);

        double aSide = myTriangle.BCSideLength;
        double bSide = myTriangle.CASideLength;
        double cSide = myTriangle.ABSideLength;

        System.out.println("Sides: " + aSide + " " + bSide + " " + cSide);
        /*System.out.println((Math.pow(aSide, 2) + Math.pow(bSide, 2) - Math.pow(cSide, 2)));
        System.out.println( (2 * aSide * cSide ) );*/
        System.out.println( Math.acos( 32 / 30 ) );

        angleSize = Math.acos( (Math.pow(aSide, 2) + Math.pow(bSide, 2) - Math.pow(cSide, 2))
                / (2 * aSide * cSide ) );
        System.out.println(angleSize);

        assertEquals(60, angleSize, 5);
    }

    /*@Test
    public void allAnglesSize() throws Exception {
        System.out.println(myTriangle.allAnglesSize());
//        assertTrue(180 == myTriangle.allAnglesSize());
        assertEquals(60, myTriangle.allAnglesSize(), 5);

    }*/
}