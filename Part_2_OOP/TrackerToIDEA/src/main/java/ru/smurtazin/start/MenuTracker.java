package ru.smurtazin.start;

import ru.smurtazin.models.Item;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by a1 on 28.12.16.
 */
public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] userActions = new UserAction[5];
//    public ArrayList<UserAction> userActions = new ArrayList<UserAction>();
    private StartUI startUI;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    // TODO: Rename
    public void fillAction() {
        // TODO: make this with ArrayList
        this.userActions[0] = new AddNewTask(this.input, this.tracker);
    }

    public void showMenu() { // showMenuItem
        for (UserAction userAction : this.userActions) {
            System.out.println(userAction.info());
        }
    }

    private class AddNewTask implements UserAction {

        /*public AddNewTask(Input input, Tracker tracker) {
            this.input = input;
            this.tracker = tracker;
        }*/

        public int key() {
            return 0;
        }

        public void execute(Input inputOutput, Tracker tracker) {
            String task_name = inputOutput.answerToQuestion("Print task's name: ");
            String task_description = inputOutput.answerToQuestion("Print task's description: ");

            tracker.add(new Item(task_name, task_description, new Date()));
//            startUI.addNewTask();
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add new task.");
        }
    }
}
