package ru.smurtazin.start;

/**
 * Created by a1 on 22.12.16.
 */
public class Menu {

//    StartUI startUi = new StartUI();
    Input inputOutput = new ConsoleInput();
//    Input inputOutput = startUi.getStartUiInputOutpus();
    Tracker tracker = new Tracker();
    MenuTracker menuTracker = new MenuTracker(inputOutput, tracker);

//    Menu menu = new Menu();

    public void askUserMenuTracker() {
        this.menuTracker.fillActionsArray();
        String menuItemNumber = "";

        while(!menuItemNumber.equalsIgnoreCase("e")) {
            this.menuTracker.showMenu();
            menuItemNumber = this.inputOutput.answerToQuestion("What do you want to do? ");

            if ( Integer.parseInt(menuItemNumber) <= menuTracker.getUserActionSize() ) {
                this.menuTracker.select( Integer.parseInt(menuItemNumber) - 1);
            } else {
                System.out.println("You have printed a wrong Menu Item Number.\n" +
                        "Please print the wrong one.");
                this.menuTracker.showMenu();
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.askUserMenuTracker();
    }
}
