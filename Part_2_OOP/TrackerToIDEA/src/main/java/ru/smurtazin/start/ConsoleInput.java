package ru.smurtazin.start;

import java.util.Scanner;

/**
 * Created by a1 on 23.12.16.
 */
public class ConsoleInput implements Input {

    /*private Scanner sc = new Scanner(System.in);

    @Override
    public String answerToQuestion(String question) {
        System.out.print(question);
        return sc.nextLine();
    }*/

    @Override
    public String answerToQuestion(String question) {
        return System.console().readLine(question);
    }

}
