package ru.smurtazin.start;


/**
 * Created by a1 on 28.12.16.
 */
public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] userActions = new UserAction[10];
    private int position = 0;

    private int key;
    StartUI startUI; // TODO: Should I make it private as it was or add public or package?

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        this.startUI = new StartUI(input, tracker);
    }

    int keyPlusPlus() {
        return key++;
    }

    public int getUserActionSize() {
        return this.userActions.length;
    }

    public int[] getUserActionSizeArray() {
        int[] getUserActionSizeArray = new int[this.userActions.length];
        for (int i = 1; i <= this.userActions.length; i++) {
            getUserActionSizeArray[i -1] = i;
        }
        return getUserActionSizeArray;
    }

    public void select(int key) {
        this.userActions[key].execute(this.input, this.tracker);
    }

    // TODO: Rename
    public void fillActionsArray() {
        // TODO: make this with ArrayList
        // TODO: Should I remove this. ?
        this.userActions[position++] = this.new AddNewTask(this.input, this.tracker);
        this.userActions[position++] = this.new EditTask(this.input, this.tracker);
        this.userActions[position++] = this.new DeleteTask(this.input, this.tracker);
        this.userActions[position++] = this.new ShowTasksList(this.input, this.tracker);
        this.userActions[position++] = this.new ShowFilteredList(this.input, this.tracker);
    }

    public void addAction(UserAction action) {
        this.userActions[position++] = action;
    }

    public void showMenu() {
        this.key = 1;
        for (UserAction userAction : this.userActions) {
            if (userAction != null) {
                System.out.println(userAction.info());
            }
        }
        System.out.println("\nE. Exit.");
    }

    public void show() {
        this.key = 1;
        for (UserAction userAction : this.userActions) {
            if (userAction != null) {
                System.out.println(userAction.info());
            }
        }
    }

    private class AddNewTask implements UserAction {

        public AddNewTask(Input input, Tracker tracker) {
            MenuTracker.this.input = input;
            MenuTracker.this.tracker = tracker;
        }

        public int key() {
            return keyPlusPlus();
        }

        public void execute(Input inputOutput, Tracker tracker) {
            /*String task_name = inputOutput.answerToQuestion("Print task's name: ");
            String task_description = inputOutput.answerToQuestion("Print task's description: ");*/

//            tracker.add(new Item(task_name, task_description, new Date())); // TODO: it works
            System.out.println("Log 1");
            MenuTracker.this.startUI.addNewTask(); // TODO: it doesn't work
            System.out.println("Log 2");
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add new task.");
        }
    }

    private class EditTask implements UserAction {

        public EditTask(Input input, Tracker tracker) {
            MenuTracker.this.input = input;
            MenuTracker.this.tracker = tracker;
        }

        public int key() {
            return keyPlusPlus();
        }

        public void execute(Input inputOutput, Tracker tracker) {
            // TODO: Here should be some user interface
            MenuTracker.this.startUI.editTask();
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Edit some Task.");
        }
    }

    private class DeleteTask implements UserAction {

        public DeleteTask(Input input, Tracker tracker) {
            MenuTracker.this.input = input;
            MenuTracker.this.tracker = tracker;
        }

        public int key() {
            return keyPlusPlus();
        }

        public void execute(Input inputOutput, Tracker tracker) {
            // TODO: Here should be some user interface, or not?
            MenuTracker.this.startUI.deleteTask();
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Delete some Task.");
        }
    }

    private class ShowTasksList implements UserAction {

        public ShowTasksList(Input input, Tracker tracker) {
            MenuTracker.this.input = input;
            MenuTracker.this.tracker = tracker;
        }

        public int key() {
            return keyPlusPlus();
        }

        public void execute(Input inputOutput, Tracker tracker) {
            System.out.println("\nAll tasks: ");
            if (MenuTracker.this.tracker.items.isEmpty() ) {
                System.out.println("There is no any task.");
            }
//            MenuTracker.this.startUI.showTasksList(MenuTracker.this.tracker.findAll());
            System.out.println("Some log 1");
            MenuTracker.this.startUI.showAllTasks();
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show All Tasks.");
        }
    }

    private class ShowFilteredList implements UserAction {

        public ShowFilteredList(Input input, Tracker tracker) {
            MenuTracker.this.input = input;
            MenuTracker.this.tracker = tracker;
        }

        public int key() {
            return keyPlusPlus();
        }

        public void execute(Input inputOutput, Tracker tracker) {
            String keyToFound = inputOutput.answerToQuestion("What sequence do you want to search between item's names? ");
            System.out.println("Founded items: ");
            MenuTracker.this.startUI.showTasksList( MenuTracker.this.tracker.findByName(keyToFound) );
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show Filtered List.");
        }
    }

}
