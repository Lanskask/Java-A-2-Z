package ru.smurtazin.start;

import ru.smurtazin.models.*;

public class Tracker extends Item {
	
	public Item[] items = new Item[3];

	public static void main(String[] args) {
		/*Item item = new Item("name", "desc", 0l);
		System.out.println(
			"Item objet:\n" + 
			"\tName: " + item.getName() + ";\n" + 
			"\tDesc: " + item.getDescription() + ";"
		);
		System.out.println();

		// Task task = new Task("name", "desc");
		Item task = new Task("name", "desc");
		
		System.out.println(
			"Task objet:\n" + 
			"\tName: " + task.getName() + ";\n" + 
			"\tDesc: " + task.getDescription() + ";"
		);*/

		Tracker tracker = new Tracker();

		tracker.items[0] = new Item("item", "desc", 0l);
		tracker.items[1] = new Task("task", "desc");
		tracker.items[2] = new Bug();

		for (Item item : tracker.items) {
			System.out.println(
				"\nOne more object:\n" + 
				"\tName: " + item.getName() + ";\n" + 
				"\tDesc: " + item.getDescription() + ";"
			);	

			if (item instanceof Task) {
				System.out.println(
					"\tCalculated price: " + ((Task) item).calculatePrice()
				);
			}
		}

		WorkingWithMenu();
	}
}