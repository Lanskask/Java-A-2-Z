package factorial;

/**
 * Created by a1 on 30.09.16.
 */
public class Factorial {

    private int previosNumber = 1;

    public void makeFactorial(int numberToFactorize) {
        for (int i = 1; i <= numberToFactorize; i++) {
            this.previosNumber *= i;
        }
    }

    public int getFactorizedNumber() {
        return this.previosNumber;
    };

}
