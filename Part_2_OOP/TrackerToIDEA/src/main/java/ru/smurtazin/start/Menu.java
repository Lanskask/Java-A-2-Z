package ru.smurtazin.start;

import ru.smurtazin.models.Item;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by a1 on 22.12.16.
 */
public class Menu {

    StartUI startUi = new StartUI();

    public void printMenu() {
        String menuItemsString = "1. Show All Tasks" +
                "2. Add New Task" +
                "3. Edit some Task" +
                "4. Delete some Task" +
                "5. Show Filtered List";
        System.out.println("Choose some thing in menu.\n\tMenu:" + menuItemsString + "\n\tE. Quit");
    }

    public void askUser() {
        String menuItemNumber = System.console().readLine(
                "What secuence do you want to search between item's names? ");

        if (menuItemNumber.equals(1)) {
            startUi.showAllTasks();
        } else if (menuItemNumber.equals(2)) {
            startUi.addNewTask();
        } else if (menuItemNumber.equals(3)) {
            startUi.editTask();
        } else if (menuItemNumber.equals(4)) {
            startUi.deleteTask();
        } else if (menuItemNumber.equals(5)) {
            startUi.showFilteredList();
        /*} else if (menuItemNumber.equals(6)) {
            startUi.addCommentToTask();
        } else if (menuItemNumber.equals(7)) {
            startUi.showTaskComments();*/
        } else if (menuItemNumber.equalsIgnoreCase("e")) {
            System.exit(0);
        } else {
            System.out.println("You have printed a wrong Menu Item Number.\n" +
                    "Please print the wrong one.");
            askUser();
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        menu.askUser();
    }
}
