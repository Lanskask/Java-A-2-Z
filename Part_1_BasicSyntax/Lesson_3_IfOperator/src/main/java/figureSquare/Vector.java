package figureSquare;

/**
 * Created by a1 on 14.10.16.
 */
public class Vector {
    public double X, Y;
    private double vectorLength = 0;
    Point A, B;
//    Point A = new Point(0,0);
//    Point B = new Point(0,3);

//    Point(double x, double y)
//    Vector(Point A, Point B)

//    Vector AB = new Vector(a, b);
    public Vector(Point A, Point B) {
        this.A = A;
        this.B = B;
//        System.out.println("B: " + B + "; A:" + A);
        /** TODO I think that everithins should be done with out Math.abs at vectors coordinates*/
//        this.X = Math.abs(B.x - A.x);
//        this.Y = Math.abs(B.y - A.y);
        this.X = B.x - A.x;
        this.Y = B.y - A.y;
//        System.out.println("B.x: " + B.x + "; A.x:" + A.x);
    }

    /*private void vectorLengthCount() {
        vectorLength = Math.sqrt( Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
    }*/

    double getVectorLength() {
        /*return vectorLength;*/
        return Math.sqrt( Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2) );
    }

}
