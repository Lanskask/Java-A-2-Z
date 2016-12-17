package ru.smurtazin.start;

import ru.smurtazin.models.*;

public class Tracker extends Item {
	
	public Item[] items = new Item[3];

	public static void main(String[] args) {
		private Item[] items = new Item[10];
		private int position = 0;

		public Item add(Item item) {
			this.items[position++] = item;
			return item;
		}

		public addNewTask() {
			System.out.println("Add new task:");
      String task_name = System.console().readLine("Print task's name:");
      String task_description = System.console().readLine("Print task's description:");
		}
		public editTask(String id) {
			String task_id = System.console().readLine("Choose task's id:");
      String task_description = System.console().readLine("Print task's description:");
		}
		public deleteTask(String id) {

		}
		public showTasksList() {
        System.out.println("All tasks:") 
        for (Task task : tasks) {
        	System.out.println(task.id);
        	System.out.println(task.name);
        	System.out.println(task.description);
        }
		}
		/*public showTaskListFiltered(String id) {

		}*/
		public addCommentToTask(String id) {

		}
	}
}