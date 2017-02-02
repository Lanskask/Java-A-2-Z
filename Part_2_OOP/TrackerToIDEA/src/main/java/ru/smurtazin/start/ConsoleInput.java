package ru.smurtazin.start;

import java.util.Scanner;

/**
 * Created by a1 on 23.12.16.
 */
public class ConsoleInput implements Input {

    private Scanner sc = new Scanner(System.in);

    @Override
    public String answerToQuestion(String question) {
        System.out.print(question);
        return sc.nextLine();
    }

    public int answerToQuestionWithExit(String question, int[] range) {
        String answer = this.answerToQuestion(question);
        boolean exist = false;
        int key = Integer.valueOf(answer);

        if( !answer.equalsIgnoreCase("e")) {
            for (int value : range) {
                if (value == key) {
                    exist = true;
                    break;
                }
            }
        }

        if (exist) {
            return key;
        } else {
            throw new OutOfMenuException("Out of menu range");
        }
    }

    public int answerToQuestion(String question, int[] range) {
        int key = Integer.valueOf(this.answerToQuestion(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new OutOfMenuException("Out of menu range");
        }
    }

}
