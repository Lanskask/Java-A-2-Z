package ru.smurtazin.start;

import ru.smurtazin.models.*;
import ru.smurtazin.Actions.*;

public class WorkingWithMenu {

	/*MenuItem addNewTask = new MenuItem;

	String menuItems[] = {"Add new task", "Edit task", "Delete task", "Show task List", "Show filtered task list", "Add comment to task"};*/

	for (int i = 0; i <= menuItems.length(); i++) {
		System.out.println(i + ". " + menuItem);
	}
	System.out.println("q. Exit");

	// Menu Running
	while (true) {
	  System.out.println(menu);

	  String input = System.console().readLine();
	  if ("q".equals(input)) {
	      System.out.println("Exit!");
	      System.exit(0);
	  }

	  System.out.println("You print: " + input);
	  System.out.println("-----------\n");
	}

}