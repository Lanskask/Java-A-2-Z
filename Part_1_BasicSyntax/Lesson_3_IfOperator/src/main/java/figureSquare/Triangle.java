package figureSquare;

/**
 * Created by a1 on 30.09.16.
 */
public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        /*
         * By the Geron's Formula
         */

        double square, perimetre, AB, BC, CA;
        AB = a.distanceTo(b);
        BC = b.distanceTo(c);
        CA = c.distanceTo(a);

        perimetre = (AB + BC + CA) / 2;
        square = Math.sqrt( perimetre *
                            (perimetre - AB) *
                            (perimetre - BC) *
                            (perimetre - CA)
                          );

        return square;
    }

    public double maxLength(Point a, Point b, Point c) {
        double maxLength = 0;

        maxLength = a.distanceTo(b);

        if( b.distanceTo(c) > maxLength ) {
            maxLength = b.distanceTo(c) ;
        } else if (c.distanceTo(a) > maxLength ) {
            maxLength = c.distanceTo(a);
        }

        return maxLength;
    }

}