package figureSquare;

/**
 * Created by a1 on 30.09.16.
 */
public class Triangle {

    // Fields
    public Point a;
    public Point b;
    public Point c;
    double AB, BC, CA;

    private double area;
    public double getArea() {
        return area;
    }

    private double maxLength;
    public double getMaxLength() {
        return maxLength;
    }

    // Methods
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.AB = a.distanceTo(b);
        this.BC = b.distanceTo(c);
        this.CA = c.distanceTo(a);
    }

    private boolean triangleExistion(double AB, double BC, double CA) {
//        this.a = a;
//        this.b = b;
//        this.c = c;

//        Point[] points = new Point[3];
//        points[0] = this.a;
//        points[1] = this.b;
//        points[2] = this.c;

        boolean exist = false;
        if ( (AB + BC > CA) ||
                (BC + CA > AB) ||
                (CA + AB > BC) ) {
            exist = true;
        }
        return exist;
    }

    public void area() {
        /*
         * By the Geron's Formula
         */
        if ( this.triangleExistion(AB, BC, CA) ) {
            double halfPerimeter;

            halfPerimeter = (AB + BC + CA) / 2;
            area = Math.sqrt( halfPerimeter *
                    (halfPerimeter - AB) *
                    (halfPerimeter - BC) *
                    (halfPerimeter - CA)
            );
        } else {
            System.out.println("Triangle doesn't exist!");
        }
    }

    public void maxLength() {

//        AB = this.AB;
//        BC = this.BC;
//        CA = this.CA;

//        double maxLength = 0;
//        this.maxLength = maxLength;
//        double maxLength = AB;
        this.maxLength = AB;

        if( BC > maxLength ) {
            maxLength = BC ;
        } else if ( CA > maxLength ) {
            maxLength = CA;
        }
    }
}