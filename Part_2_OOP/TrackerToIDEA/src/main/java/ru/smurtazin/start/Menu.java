package ru.smurtazin.start;

/**
 * Created by a1 on 22.12.16.
 */
public class Menu {

    StartUI startUi = new StartUI(new StubInput(
            new String[] {"newItem1 name", "newItem1 description"}
    ), new Tracker());

    public void printMenu() {
        String menuItemsString =
                "\n\t1. Show All Tasks" +
                "\n\t2. Add New Task" +
                "\n\t3. Edit some Task" +
                "\n\t4. Delete some Task" +
                "\n\t5. Show Filtered List";
        System.out.println("---------------------------\n" +
                        "Choose some action in menu.\nMenu:" +
                        menuItemsString +
                        "\n\n\tE. Quit");
    }

    public void askUser() {
        String menuItemNumber = "";
        while(!menuItemNumber.equalsIgnoreCase("e")) {
            this.printMenu();
            menuItemNumber = System.console().readLine(
                    "What do you want to do? ");
            if (menuItemNumber.equals("1")) {
                startUi.showAllTasks();
            } else if (menuItemNumber.equals("2")) {
                startUi.addNewTask();
            } else if (menuItemNumber.equals("3")) {
                startUi.editTask();
            } else if (menuItemNumber.equals("4")) {
                startUi.deleteTask();
            } else if (menuItemNumber.equals("5")) {
                startUi.showFilteredList();
            } else if (menuItemNumber.equalsIgnoreCase("e")) {
                System.out.println("Exit ...");
                System.exit(0);
            } else {
                System.out.println("You have printed a wrong Menu Item Number.\n" +
                        "Please print the wrong one.");
                askUser();
            }
        }
    }

    public static void main(String[] args) {
        // TODO: Uncomment to do by my way... or not?
        /*Menu menu = new Menu();
        menu.askUser();*/

        System.out.println("Here should be new staff!!");
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(input, tracker);

        menuTracker.fillAction();
        menuTracker.showMenu();
    }
}
