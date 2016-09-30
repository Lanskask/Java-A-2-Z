package figureSquare;

/**
 * Created by a1 on 30.09.16.
 */
public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    double square;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        //calculate the triangle area
        square = b.distanceTo(c) * a.distanceTo(b) /
                a.distanceTo(c) * a.distanceTo(c) / 2;
        if (square == 0 ) {
            System.out.println("It's impossible to build Triangle with such points.");
        }
        return square;
    }
}