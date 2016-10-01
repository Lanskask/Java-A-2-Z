package factorial;

/**
 * Created by a1 on 30.09.16.
 */
public class Factorial {

//    public Factorial {
//        int numberToFactorize = 5;
//    };

    static int previosNumber = 1;

    static public int makeFactorial(int numberToFactorize) {
        for (int i = 1; i <= numberToFactorize; i++) {
            previosNumber *= i;
        }
        return  previosNumber;
    }

    public static void main(String[] args) {
        int numberToFactorize = 5;
        System.out.println( numberToFactorize + "! = " +
                            makeFactorial(numberToFactorize));
    }
//    int getPreviosNumber = value[i] * value[i + 1];

}
