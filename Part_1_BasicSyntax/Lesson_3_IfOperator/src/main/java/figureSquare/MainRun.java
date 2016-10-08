package figureSquare;

/**
 * Created by a1 on 30.09.16.
 */
public class MainRun {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
//    static Point a = new Point(4, 2);
        Point b = new Point(0, 3);
        Point c = new Point(4, 0);


        Triangle meinTriangle = new Triangle(a, b, c);

        System.out.println("AB: " + meinTriangle.AB +" "+
                "BC: " + meinTriangle.BC +" "+
                "CA: " + meinTriangle.CA);

        meinTriangle.area();
        System.out.println("Area: " + meinTriangle.getArea());
//        System.out.format("Area: %3.4f\n", meinTriangle.getArea());

        meinTriangle.maxLength();
        System.out.println("Max Length: " + meinTriangle.getMaxLength());
//        System.out.format("MaxLength: %3.4f\n", meinTriangle.getMaxLength());

//        if (meinTriangle.area() == 0 ) {
//            System.out.println("It's impossible to build Triangle with such points.");
//        } else {
//            System.out.println("Triangle area is: " + meinTriangle.area());
//            System.out.println("Max Length is: " + meinTriangle.maxLength(a, b, c));
//        }
//
//        System.out.println( "Triangle sides: " +
//                a.distanceTo(b) + "; " + b.distanceTo(c) + "; " + c.distanceTo(a) + ". " );
    }

}
