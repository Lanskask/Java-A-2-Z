package ru.smurtazin.start;

/**
 * Created by a1 on 15.01.17.
 */
public class ValidateInput extends ConsoleInput {

    public int answerToQuestion(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.answerToQuestion(question, range);
                invalid = false;
            } catch (OutOfMenuException oomEx) {
                System.out.println("Please enter item's number from available numbers!");
            } catch (NumberFormatException nfEx) {
                System.out.println("Please enter correct data!");
            }
        } while (invalid);
        return value;
    }

}
