package calculator2big;

/**
 * Created by a1 on 01.10.16.
 * @author – smurtazin
 * @since – 01.10.16
 * @version 0.1
 */
public class Calculator {

    private int result;
//    private double result;

    public void add(int ... params) {
        for ( int param : params) {
            this.result += param;
        }
    }

    public void substruct(int ... params) {

        int resultIn = params[0];
        for (int i = 1; i < params.length; i++) {
            resultIn -= params[i];
        }
        this.result = resultIn;
//      for ( int param : params) {
//          this.result -= param;
//      }
    }

    public void multiple(int ... params) {
//        for ( int param : params) {
//            this.result *= param;
//        }
        int resultIn = params[0];
        for (int i = 1; i < params.length; i++) {
            resultIn *= params[i];
        }
        this.result = resultIn;
    }
//
    public void div(int ... params) {
        if (params.length > 0 ) {
//           for ( int param : params) {
//                this.result /= param;
//           }

            int resultIn = params[0];
            for (int i = 1; i < params.length; i++) {
                if (params[i] == 0) {
                    System.out.println("Impossible to devide at 0.");
                }
                resultIn /= params[i];
            }
            this.result = resultIn;

        } else {
            System.out.println("Print at least 2 args.");
        }
    }

    public int getResult() {
        return this.result;
    }

//    public double getResult() {
//        return this.result;
//    }

    public void cleanResult() {
        this.result = 0;
    }
}
