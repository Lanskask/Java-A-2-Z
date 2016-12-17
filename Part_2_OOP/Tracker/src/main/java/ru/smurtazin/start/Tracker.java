package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Random;

public class Tracker extends Item {
	
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
		System.out.println("Add new task:");
    String task_name = System.console().readLine("Print task's name:");
    String task_description = System.console().readLine("Print task's description:");
	}
	public void editTask(String id) {
		String task_id = System.console().readLine("Choose task's id:");
    String task_description = System.console().readLine("Print task's description:");
	}
	public void deleteTask(String id) {

	}
	public void showTasksList() {
      System.out.println("All tasks:");
      for (Item item : items) {
      	System.out.println(item.getId());
      	System.out.println(item.getName());
      	System.out.println(item.getDescription());
      }
	}
	/*public showTaskListFiltered(String id) {

	}*/
	public void addCommentToTask(String id) {
	// setCommentsList(String[] commentsList) 

	}
	// }
}