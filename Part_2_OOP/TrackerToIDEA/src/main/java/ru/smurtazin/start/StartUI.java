package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Date;

public class StartUI {
	public void StartUI() {

	}

	Tracker tracker = new Tracker();

	public void addNewTask() {

		System.out.println("\nYou desided to add new task.");
		String task_name = System.console().readLine("Print task's name:");
		String task_description = System.console().readLine("Print task's description:");

		Item item = new Item(task_name, task_description, new Date());

		/*
		item.setId(this.generateId());
		this.items[position++] = item;
		*/
		tracker.add(item);
	}

	public static void main(String[] args) {
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
	}
}