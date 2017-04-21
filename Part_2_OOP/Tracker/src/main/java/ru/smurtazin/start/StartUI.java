package ru.smurtazin.start;

import ru.smurtazin.models.Item;

import java.util.ArrayList;
import java.util.Date;

public class StartUI {

	private Input inputOutput;
    private Tracker tracker; // TODO: If it works - remove comment down.
//    private CMDTracker tracker;

    public StartUI() {}

//    public StartUI(Input inputOutput, Tracker tracker) {
    public StartUI(Input inputOutput, Tracker tracker) {
        this.inputOutput = inputOutput;
        this.tracker = tracker;
    }

	public void addNewTask() {
        System.out.println("\nYou desided to add new task.");
        String taskName = this.inputOutput.answerToQuestion("Print task's name: ");
		String taskDescription = this.inputOutput.answerToQuestion("Print task's description: ");

		this.tracker.add(new Item(taskName, taskDescription, new Date()));
	}

	public void editTask() {
		String taskName = null;
		String taskDescription = null;

		System.out.println("\nYou desided to edit some task.");
        String taskId = this.inputOutput.answerToQuestion("Choose task's id: ");

		String answerToChName = this.inputOutput.answerToQuestion("Do you want to change task's name? (y/n): ");
        if (answerToChName.equals("y")) {
			taskName = this.inputOutput.answerToQuestion("Print task's name: ");
		}

		String answerToChDescr = this.inputOutput.answerToQuestion("Do you want to change task's description? (y/n): ");
        if (answerToChDescr.equals("y")) {
			taskDescription = this.inputOutput.answerToQuestion("Print task's description: ");
        }

        Item item = new Item(taskName, taskDescription, new Date());
		item.setId(taskId);
        this.tracker.update(item);
	}

	private boolean checkIdExisting(String id) {
        boolean thereIsSuchId = false;
        for (Item item : this.tracker.items) {
            if (id.equals(item.getId())) {
                thereIsSuchId = true;
            }
        }
        return thereIsSuchId;
    }

	public void deleteTask() {
		System.out.println("\nYou decided to delete some task.");
		String taskId = this.inputOutput.answerToQuestion("Choose id of the task you want to delete: ");
		Item item = this.tracker.findById(taskId);

        if (!checkIdExisting(taskId)) {
            System.out.println("There is NO such id in the list!");
            // TODO exit() -> back to Print Menu Class;
            // TODO Make this if as a function and use it together with ask to print taskId
        }

		String answerToDeleteTask1 = this.inputOutput.answerToQuestion("Are you sure to delete this task? (y/n): ");
		if( answerToDeleteTask1.equals("y") ) {
			String answerToDeleteTask2 = this.inputOutput.answerToQuestion("Are you absolutely sure, that you want to detele this task? (y/n): ");
			if( answerToDeleteTask2.equals("y") ) {
				this.tracker.delete(item.getId());
			}
		}
	}

	// TODO: make it private acces when finish all with MenuTracker
	public void showTasksList(ArrayList<Item> items) {
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
						"\tItem's Date:\n\t%s\n\t", item.getCreationDate()
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
}