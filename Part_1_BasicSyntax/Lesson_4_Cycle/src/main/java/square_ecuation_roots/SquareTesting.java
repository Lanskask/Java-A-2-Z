package square_ecuation_roots;

/**
 * Created by a1 on 30.09.16.
 */
public class SquareTesting {
    public static void main(String[] args) {

//        double x1, x2;
        float start, finish, step;
        double xAnswers[];

        Square mySquare = new Square(-9, 2, 1);

        int x = 3;
        System.out.println("When X = " + x + ", Y is equal " +
                mySquare.calculate(x));

        xAnswers = mySquare.solvEquation();
        start = (float) xAnswers[0];
        finish = (float) xAnswers[1];
        step = (finish - start) / 20;

//        System.out.println(start + "; " + finish +"; "+ step);

        mySquare.show(start, finish, step);
    }
}
