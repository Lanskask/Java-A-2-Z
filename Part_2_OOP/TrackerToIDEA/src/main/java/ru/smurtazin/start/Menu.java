package ru.smurtazin.start;

/**
 * Created by a1 on 22.12.16.
 */
public class Menu {

    Input inputOutput = new ValidateInput();
    Tracker tracker = new Tracker();

    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(this.inputOutput, tracker);
        menuTracker.fillActionsArray();
        do {
            menuTracker.show();
            int numericAnswer = inputOutput.answerToQuestion(
                    "Select: ", menuTracker.getUserActionSizeArray()
            );
            System.out.println("numericAnswer: " + numericAnswer);
            menuTracker.select( numericAnswer );
        } while (! "y".equals(this.inputOutput.answerToQuestion("Exit?(y): ")));
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
//        menu.askUserMenuTracker();
        menu.init();
    }
}
