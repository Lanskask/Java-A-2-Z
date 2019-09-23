package squareequationnew;

/**
 * Created by a1 on 30.09.16.
 */
class Square {
    public float a, b, c;
    public float start, finish, step;

    double discriminant;

    double x1, x2;
    double[] xAnswers = new double[2];

    public Square(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculate(double x) {
        return  ( a * Math.pow(x, 2) + b * x + c);
    }

    void show(double start, double finish, double step) {
        if(step == 0) System.out.println("Step can't be equal zero. Choose other step value. ");
        for (double x = start; x < finish; x += step) {
            System.out.print(calculate(x) + ", ");
        }
    }
}
