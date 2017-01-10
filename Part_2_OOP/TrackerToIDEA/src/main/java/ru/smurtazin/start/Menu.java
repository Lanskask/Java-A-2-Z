package ru.smurtazin.start;

/**
 * Created by a1 on 22.12.16.
 */
public class Menu {

    StartUI startUi = new StartUI();
//    Input input = new ConsoleInput();
    Input inputOutput = startUi.getStartUiInputOutpus();
    Tracker tracker = new Tracker();
    // TODO: Should I change input to inputOutput ?
//    MenuTracker menuTracker = new MenuTracker(input, tracker);
    MenuTracker menuTracker = new MenuTracker(inputOutput, tracker);

//    Menu menu = new Menu();

    public void askUserMenuTracker() {
        this.menuTracker.fillAction();
        String menuItemNumber = "";

        while(!menuItemNumber.equalsIgnoreCase("e")) {
//            this.printMenu();
            this.menuTracker.showMenu();
            menuItemNumber = this.inputOutput.answerToQuestion("What do you want to do? ");

            if ( Integer.parseInt(menuItemNumber) < menuTracker.getUserActionSize() &&
                    Integer.parseInt(menuItemNumber) > menuTracker.getUserActionSize() ) {
                this.menuTracker.select( Integer.parseInt(menuItemNumber) );
            } else {
                System.out.println("You have printed a wrong Menu Item Number.\n" +
                        "Please print the wrong one.");
//                askUser();
                this.menuTracker.showMenu();
            }
        }
    }

    public static void main(String[] args) {
        // TODO: Uncomment to do by my way... or not?
//        menu.askUser();

        System.out.println("Here should be new staff!!");

        Menu menu = new Menu();
        menu.askUserMenuTracker();

//        Input input = new ConsoleInput();
//        Tracker tracker = new Tracker();
//        MenuTracker menuTracker = new MenuTracker(input, tracker);

    }
}
