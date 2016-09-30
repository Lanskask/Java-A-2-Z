package squareEcuationRoots;

/**
 * Created by a1 on 30.09.16.
 */
class Square {
    public float a, b, c;
    public float start, finish, step;

    double discriminant;

    double x1, x2;
//    double xAnswers[];
    double[] xAnswers = new double[2];

    public Square(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    float calculate(int x) {
        float y;
        y =  (float) ( a * Math.pow(x, 2) + b * x + c) ;
        return y;
    }

//    float solvEquation(float a, float b, float c) {
//    double[] solvEquation(Square mySquare) {
    double[] solvEquation() {
//        mySquare.a = a;
//        mySquare.b = b;
//        mySquare.c = c;

//        this.a = a;
//        this.b = b;
//        this.c = c;

        discriminant = Math.pow(b, 2) - 4 * a *c;

        if ( discriminant > 0 ) {
            System.out.println("Discriminant > 0");
            x1 = - b - Math.sqrt(discriminant);
            xAnswers[0] = x1;
            x2 = - b + Math.sqrt(discriminant);
            xAnswers[1] = x2;
        } else if ( discriminant == 0 ) {
            System.out.println("Discriminant = 0");
            x1 = - b + Math.sqrt(discriminant);
            xAnswers[0] = x1;
        } else {
            System.out.println("This equation hasn't solutions \n" +
                    "(the curve does not intersect with the X axis).");
        }

        return xAnswers;
    }

    void show(float start, float finish, float step) {

        System.out.println("Xs between " + start+
                " and " + finish + " with step: " + step);

//        System.out.println(start + "; " + finish +"; "+ step);
        for (float x1 = start; x1 < finish; x1 += step) {
            System.out.print(x1 + ", ");
        }
    }
}
