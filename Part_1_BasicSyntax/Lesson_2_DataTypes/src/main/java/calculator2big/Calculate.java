package calculator2big;

/**
 * Created by a1 on 01.10.16.
 */
public class Calculate {
    public static void main(String[] args) {

        System.out.println("Calculate...");

        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);

        int sum = first + second;

        System.out.println("Summ: " + sum);
    }
}