package ru.smurtazin.start;

/**
 * Created by a1 on 28.12.16.
 */
public interface UserAction {

    int key();

    void execute(Input input, CMDTracker tracker);

    String info();
}
