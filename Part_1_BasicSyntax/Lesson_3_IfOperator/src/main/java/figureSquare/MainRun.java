package figureSquare;

/**
 * Created by a1 on 30.09.16.
 */
public class MainRun {
//    static Point a = new Point(1, 1);
    static Point a = new Point(4, 2);
    static Point b = new Point(4, 2);
    static Point c = new Point(4, 0);

    static Triangle mein_triangle = new Triangle(a, b, c);
    public static void main(String[] arg) {
        System.out.println("Triangle area is: " + mein_triangle.area());
    }

}
