package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Date;
import java.util.Arrays;

public class StartUI {
	public void StartUI() {

	}

	Tracker tracker = new Tracker();

	/*// Functions Content
	Item add(Item);
	void update(Item); // - метод должен заменить ячейку в массиве. найти ячейку надо по циклу сравнивая getId
	void delete(Item);
	Item[] findAll();
	Item[] findByName(String key);
	Item findById(String id);*/

	public void addNewTask() {
		System.out.println("\nYou desided to add new task.");
		String task_name = System.console().readLine("Print task's name:");
		String task_description = System.console().readLine("Print task's description:");

		Item item = new Item(task_name, task_description, new Date());

		tracker.add(item);
	}
	/**
	 * Should call: update(Item item);
	 */
	public void editTask() { // TODO: check does it work or not
		String task_name = null;
		String task_description = null;

		System.out.println("\nYou desided to edit some task.");
		String task_id = System.console().readLine("Choose task's id:");

		boolean allIsNotValid = false;
		while (allIsNotValid ) {
			String answer_toChName = System.console().readLine("Do you want to change task's name? (y/n):");
			if (answer_toChName.equals("y")) {
				task_name = System.console().readLine("Print task's name:");
			}

			String answer_toChDescr = System.console().readLine("Do you want to change task's description? (y/n):");
			if (answer_toChDescr.equals("y")) {
				task_description = System.console().readLine("Print task's description:");
			}

			if (task_name != null && task_description != null) {
				boolean allIsValid = true;
				Item item = new Item(task_name, task_description, new Date());
				item.setId(task_id);
				tracker.update(item);
			}
		}
	}

	public void deleteTask() { // TODO: check does it work or not
		System.out.println("\nYou desided to delete some task.");
		String task_id = System.console().readLine("Choose id of the task you want to delete: ");
		Item item = tracker.findById(task_id);

		String answer_toDeleteTask1 = System.console().readLine("Are you sure to detele this task? (y/n):");
		if( answer_toDeleteTask1.equals("y") ) {
			String answer_toDeleteTask2 = System.console().readLine("Are you absolutely sure, that you want to detele this task? (y/n):");
			if( answer_toDeleteTask2.equals("y") ) {
				tracker.delete(item);
			}
		}
	}
	public void showTasksList(Item[] items) {
		// TODO: Maby here should be printed something other than "\nAll tasks:"
		// System.out.println("\nAll tasks: ");
		// for (Item item : items) {
		// TODO: Should call: Item[] findAll();
		for (Item item : items) {
			if (item != null) {
				System.out.println(
						"Item " +
								Arrays.asList(items).indexOf(item)
								+ ":"
				);
				System.out.println(
						"\tItem's ID: " +
								item.getId()
				);
				System.out.println(
						"\tItem's name: " +
								item.getName()
				);
				System.out.println(
						"\tItem's description:\n\t\t " +
								item.getDescription()
				);
				System.out.println(
						"\tItem's Date:\n\t " +
								item.getCreationDate()
				);
			}
		}
	}
	public void showAllTasks() {
		System.out.println("\nAll tasks: ");
		this.showTasksList(tracker.findAll());
	}
	/**
	 * Should call: Item[] findByName(String key);
	 */
	public void showFilteredList() {
		String key = System.console().readLine("What secuence do you whant to search between item's names? ");
		System.out.println("Founded items: ");
		this.showTasksList( tracker.findByName(key) );
	}

	/*public void addCommentToTask() {
		// setCommentsList(String[] commentsList)
		System.out.println("\nYou decided to add comment to some task.");
		String task_id = System.console().readLine("Choose a task's id which you want to add comment to: ");
		tracker.items[Arrays.asList(items).indexOf( findById( item.getId() ) )] = tracker.findById(task_id);

    String answer = System.console().readLine("Do you want to add a comment to this task? (y/n): ");
    if( answer.equals("y") ) {
	    String task_comment = System.console().readLine("Print comment: ");
			tracker.items[Arrays.asList(items).indexOf(item)].addComment(task_comment);
    }
	}*/

	/*public void showTaskComments() {
		System.out.println("\nYou desided to view some task's comments.");
		String task_id = System.console().readLine("Choose task's id: ");
		Item item = findById(task_id);

		System.out.println(
			"\nAll task " +
			item.getId() +
			" comments: "
		);

    for (String comment : item.getCommentsList()) {
    	if (comment != null) {
    		System.out.println(
      		"Comment " +
					Arrays.asList(items).indexOf(item)
				 	+ ":\n\t" + comment
				 );
    	}
    }
	}*/

	// ----------------------------------------------
	/*public static void main(String[] args) {
		Tracker tracker = new Tracker();
		StartUI startUI = new StartUI();

		// --- Function testing: ---
		Item newItem1 = new Item("newItem1 name", "newItem1 description", new Date() );
		tracker.add(newItem1);

		Item newItem2 = new Item("newItem2 name2", "newItem2 description2", new Date() );
		tracker.add(newItem2);

		// --- Tested functions: ---
		tracker.showTasksList();	// +

		// startUI.addNewTask(); // +
		// tracker.editTask(); // +

		// --- Function to test: ---
		tracker.addCommentToTask();
		tracker.addCommentToTask();
		tracker.showTaskComments();

		// tracker.deleteTask();
		// --- Functions to add: ---
		// tracker.showFilteredTaskList();

		// --- Result ---
		tracker.showTasksList();
	}*/

}