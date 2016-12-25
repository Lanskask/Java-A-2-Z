package ru.smurtazin.start;

import ru.smurtazin.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Arrays;

public class StartUI {
//    Input inputOutput = new StubInput();
//    Input inputOutput;
    Input inputOutput;
    Tracker tracker; // TODO: make private?

    public StartUI() {}

    public StartUI(Input inputOutput, Tracker tracker) {
        this.inputOutput = inputOutput;
        this.tracker = tracker;
	}

	public void addNewTask() {
        System.out.println("\nYou desided to add new task.");
        String task_name = this.inputOutput.answerToQuestion("Print task's name: ");
		String task_description = this.inputOutput.answerToQuestion("Print task's description: ");

		Item item = new Item(task_name, task_description, new Date());
		this.tracker.add(item);
	}

	public void editTask() {
		String task_name = null;
		String task_description = null;

		System.out.println("\nYou desided to edit some task.");
        String task_id = this.inputOutput.answerToQuestion("Choose task's id: ");

		String answer_toChName = this.inputOutput.answerToQuestion("Do you want to change task's name? (y/n): ");
        if (answer_toChName.equals("y")) {
			task_name = this.inputOutput.answerToQuestion("Print task's name: ");
		}

		String answer_toChDescr = this.inputOutput.answerToQuestion("Do you want to change task's description? (y/n): ");
        if (answer_toChDescr.equals("y")) {
			task_description = this.inputOutput.answerToQuestion("Print task's description: ");
        }

        Item item = new Item(task_name, task_description, new Date());
		item.setId(task_id);
        this.tracker.update(item);

	}

	private boolean checkIdExisting(String id) {
        boolean thereIsSuchId = false;
        for (Item item : this.tracker.items) {
            if (id.equals(item.getId())) {
                thereIsSuchId = true;
            }
        }
        /*if (thereIsSuchId = true) {
            System.out.println("There is such id in the list.");
        } else {
            System.out.println("There is NO such id in the list!");
            exit();
        }*/
        return thereIsSuchId;
    }

	public void deleteTask() {
		System.out.println("\nYou decided to delete some task.");
		String task_id = this.inputOutput.answerToQuestion("Choose id of the task you want to delete: ");
		Item item = this.tracker.findById(task_id);

        if (!checkIdExisting(task_id)) {
            System.out.println("There is NO such id in the list!");
            // TODO exit() -> back to Print Menu Class;
            // TODO Make this if as a function and use it together with ask to print task_id
        }

		String answer_toDeleteTask1 = this.inputOutput.answerToQuestion("Are you sure to delete this task? (y/n): ");
		if( answer_toDeleteTask1.equals("y") ) {
			String answer_toDeleteTask2 = this.inputOutput.answerToQuestion("Are you absolutely sure, that you want to detele this task? (y/n): ");
			if( answer_toDeleteTask2.equals("y") ) {
				this.tracker.delete(item);
			}
		}
	}

	private void showTasksList(ArrayList<Item> items) {
		// TODO: Should call: Item[] findAll();
		for (Item item : items) {
			if (item != null) {
				System.out.printf(
				        "Item %s :\n", items.indexOf(item) + 1
                );
				System.out.printf(
					"\tItem's ID: %s\n", item.getId()
				);
				System.out.printf(
				    "\tItem's name: %s\n", item.getName()
				);
				System.out.printf(
					"\tItem's description:\n\t\t%s\n ", item.getDescription()
				);
				System.out.printf(
						"\tItem's Date:\n\t%s\n", item.getCreationDate()
				);
			}
		}
	}

	public void showAllTasks() {
		System.out.println("\nAll tasks: ");
        if (this.tracker.items.isEmpty() ) {
            System.out.println("There is no any task.");
        }
		this.showTasksList(this.tracker.findAll());
	}

	public void showFilteredList() {
		String key = this.inputOutput.answerToQuestion("What sequence do you want to search between item's names? ");
		System.out.println("Founded items: ");
		this.showTasksList( this.tracker.findByName(key) );
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

}