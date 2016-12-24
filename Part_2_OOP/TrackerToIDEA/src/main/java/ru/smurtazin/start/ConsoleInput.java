package ru.smurtazin.start;

/**
 * Created by a1 on 23.12.16.
 */
public class ConsoleInput implements Input {

    @Override
    public String answerToQuestion(String question) {
        return System.console().readLine(question);
    }
    /*@Override
    public String readLine(String question) {
        return System.console().readLine(question);
    }*/
}
