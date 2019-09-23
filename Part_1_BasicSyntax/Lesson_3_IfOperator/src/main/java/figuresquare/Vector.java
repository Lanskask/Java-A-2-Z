package figuresquare;

/**
 * Created by a1 on 14.10.16.
 */
public class Vector {
    public double X, Y;
    private double vectorLength = 0;
    Point A, B;

    public Vector(Point A, Point B) {
        this.A = A;
        this.B = B;

        this.X = B.x - A.x;
        this.Y = B.y - A.y;
    }

    double getVectorLength() {
        return Math.sqrt( Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2) );
    }
}
