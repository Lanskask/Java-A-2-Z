package squareEcuationRoots;

/**
 * Created by a1 on 30.09.16.
 */
class Square {

    public Square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    private double a, b, c;
//    a = -9;
//    b = 2;
//    c = 1;

    float calculate(int x) {
        float y;
        y =  a * Math.pow(x, 2) + b * x + c;
        return y;
    }

    void show(start, finish, step) {

    }
}
