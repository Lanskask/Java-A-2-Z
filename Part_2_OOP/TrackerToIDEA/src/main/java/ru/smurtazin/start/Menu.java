package ru.smurtazin.start;

/**
 * Created by a1 on 22.12.16.
 */
public class Menu {

//    Input inputOutput = new ValidateInput();
//    Tracker tracker = new Tracker();

    public void init() {
        Tracker tracker = new Tracker();
        Input inputOutput = new ValidateInput();

        MenuTracker menuTracker = new MenuTracker(inputOutput, tracker);
        menuTracker.fillActionsArray();
        UserAction deleteAction = new UserAction() {
            @Override
            public int key() {
                return menuTracker.keyPlusPlus();
            }

            @Override
            public void execute(Input input, Tracker tracker) {
                menuTracker.startUI.deleteTask();
            }

            @Override
            public String info() {
                return String.format(
                        "%s. %s", this.key(), "Delete some Task."
                );
            }
        };
        menuTracker.addAction(deleteAction);
        do {
            menuTracker.show();
            int numericAnswer = inputOutput.answerToQuestion(
                    "Select: ", menuTracker.getUserActionSizeArray()
            );
            menuTracker.select( numericAnswer );
        } while (! "y".equals( inputOutput.answerToQuestion("Exit?(y): ") ));
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
//        menu.askUserMenuTracker();
        menu.init();
    }
}
