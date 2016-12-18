package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Random;
import java.util.Date;
import java.util.Arrays;

// public class Tracker extends Item {
public class Tracker {

	/*public Tracker() {
		
	}*/
	
	public Item[] items = new Item[10];
	private int position = 0;

	//
	private static final Random RN = new Random(System.currentTimeMillis());
	//

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	protected Item findById(String id) { 
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	private String generateId() {
		return String.valueOf(RN.nextInt());
	}

	// --- My Functions ---
	public void addNewTask() {
		System.out.println("\nYou desided to add new task.");
		String task_name = System.console().readLine("Print task's name:");
    String task_description = System.console().readLine("Print task's description:");

    Item item = new Item(task_name, task_description, new Date());

		item.setId(this.generateId());
		this.items[position++] = item;
	}
	public void showTasksList() {
		// TODO: Maby here should be printed something other than "\nAll tasks:"
    System.out.println("\nAll tasks: ");
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
	public void editTask() {
		System.out.println("\nYou desided to edit some task.");
		String task_id = System.console().readLine("Choose task's id:");
		// TODO: тут (Item item) создаётся абсолютно новая переменная которая не видна в массиве items[] или это всего-лищь ссылка на то что нужно, то есть и еть тот найденный item в массиве items?
		Item item = findById(task_id);

    // TODO: make little_functions file
    String answer_toChName = System.console().readLine("Do you want to change task's name? (y/n):");
    if( answer_toChName.equals("y") ) {
    	// TODO: менять имя task_name на new_task_name?
	    String task_name = System.console().readLine("Print task's name:");
	    item.setName(task_name);
    }

    String answer_toChDescr = System.console().readLine("Do you want to change task's description? (y/n):");
		if( answer_toChDescr.equals("y") ) {
    	// TODO: менять имя task_description на new_task_description?
	    String task_description = System.console().readLine("Print task's description:");
	    item.setDescription(task_description);
    } 
	}
	public void deleteTask() {
		System.out.println("\nYou desided to delete some task.");
		String task_id = System.console().readLine("Choose id of the task you want to delete: ");
		Item item = findById(task_id);

    String answer_toDeleteTask1 = System.console().readLine("Are you sure to detele this task? (y/n):");
    if( answer_toDeleteTask1.equals("y") ) {
	    String answer_toDeleteTask2 = System.console().readLine("Are you absolutely sure, that you want to detele this task? (y/n):");
    	if( answer_toDeleteTask2.equals("y") ) {
	    	// TODO: I don't know why, but this doesn't work: item = null;
				items[Arrays.asList(items).indexOf(item)] = null;
	   	}
    }
	}
	
	// TODO: Realise this function
	/*public showFilteredTaskList() {

	}*/
	public void addCommentToTask() {
	// setCommentsList(String[] commentsList) 
		System.out.println("\nYou decided to add comment to some task.");
		String task_id = System.console().readLine("Choose a task's id which you want to add comment to: ");
		Item item = findById(task_id);

    // TODO: make little_functions file <- validate_answer_function(String question) -> y - contunue/ n - break (or nothing)
    String answer = System.console().readLine("Do you want to add a comment to this task? (y/n): ");
    if( answer.equals("y") ) {
    	// TODO: менять имя task_name на new_task_name?
	    String task_comment = System.console().readLine("Print comment: ");
	    // TODO: make it like: item.addComment(task_comment);
			items[Arrays.asList(items).indexOf(item)].addComment(task_comment);
    }
	}
	public void showTaskComments() {
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
				 	+ ":"
				 );
    	}
    } 

	} 

}