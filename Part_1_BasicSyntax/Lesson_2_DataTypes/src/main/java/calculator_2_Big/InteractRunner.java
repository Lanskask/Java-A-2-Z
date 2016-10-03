package calculator_2_Big;

import java.util.Scanner;

/**
 * Created by a1 on 01.10.16.
 */
public class InteractRunner {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";

            while( !exit.equals("yes")) {

                System.out.println("Enter first arg: ");;
                String first = reader.next();

                System.out.println("Enter second arg: ");;
                String second = reader.next();

                calc.add( Integer.valueOf(first),
                          Integer.valueOf(second));
                System.out.println("Result: " +
                        calc.getResult());

                calc.cleanResult();

                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }

    }
}
