package ru.smurtazin.start;

import ru.smurtazin.models.Item;

import java.util.ArrayList;

/**
 * Created by a1 on 28.12.16.
 */
public class MenuTracker {

    private Input input;
    private Tracker tracker;
//    private UserAction[] userActions = new UserAction[5];
    public ArrayList<UserAction> userActions = new ArrayList<UserAction>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        // TODO: Make this method
    }

    
}
