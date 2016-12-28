package ru.smurtazin.start;

/**
 * Created by a1 on 23.12.16.
 */
public class StubInput implements Input {
    String[] answers; // TODO: How to test outputs? Should it be final?
    int position = 0;

    public StubInput() {}

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String answerToQuestion(String question) {
        return this.answers[position++];
    }
}
