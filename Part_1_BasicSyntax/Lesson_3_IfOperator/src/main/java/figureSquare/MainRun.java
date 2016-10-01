package figureSquare;

/**
 * Created by a1 on 30.09.16.
 */
public class MainRun {
    static Point a = new Point(1, 1);
//    static Point a = new Point(4, 2);
    static Point b = new Point(4, 2);
    static Point c = new Point(4, 0);

    static Triangle meinTriangle = new Triangle(a, b, c);

    public static void main(String[] args) {

        if (meinTriangle.area() == 0 ) {
            System.out.println("It's impossible to build Triangle with such points.");
        } else {
            System.out.println("Triangle area is: " + meinTriangle.area());
            System.out.println("Max Length is: " + meinTriangle.maxLength(a, b, c));
        }

        System.out.println( "Triangle sides: " +
                a.distanceTo(b) + "; " + b.distanceTo(c) + "; " + c.distanceTo(a) + ". " );
    }

}
