package calculator_2_Big;

/**
 * Created by a1 on 01.10.16.
 */
public class ArgRunner {

    public static void main(String[] args) {
        System.out.println("Calculate...");
        if (args.length == 2) {
            int first = Integer.valueOf(args[0]);
            int second = Integer.valueOf(args[1]);

            System.out.println("First arg:" + first +
                                "\nSecond arg:" + second +
                                "\n");

            Calculator calc = new Calculator();
            calc.add(first, second);
            System.out.println("Add: " +
                    calc.getResult());
            calc.cleanResult();

            calc.substruct(first, second);
            System.out.println("Substruct: " +
                    calc.getResult());
            calc.cleanResult();

//            calc.multiple(first, second);
//            System.out.println("multiple: " +
//                    calc.getResult());
//            calc.cleanResult();
//
//            calc.div(first, second);
//            System.out.println("div: " +
//                    calc.getResult());
//            calc.cleanResult();

        } else {
            System.out.println("Enter two parameters: ");
        }
    }
}
