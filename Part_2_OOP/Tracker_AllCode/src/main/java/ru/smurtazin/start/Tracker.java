package ru.smurtazin.start;

import ru.smurtazin.models.Item;
import ru.smurtazin.models.Task;
import ru.smurtazin.models.Bug;
import java.util.Random;

public class Tracker {

	private Item[] items = new Item[3];
	private int position = 0;
	private static final Random RN = new Random();

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}

	public void edit(Item fresh) {
		// createUpdate, addUdate, comments
		// сохранить старые данные в новые поля 
		// for (Item item : items) {
		for (int index = 0; index != items.length; ++index) {
			Item item = items[index];
			if ( item != null && item.getId().equals(fresh.getId())) {
				System.out.println("Log 1. In edit method.");
				items[index] = fresh; // item = fresh;	
				break; 
			}
		}
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

	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
	}

	public Item[] getAll() {
		Item[] result = new Item[this.position];
		for (int index=0; index!=this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	
	//2.2
	/*public static void main(String[] args) {
		// 1.1
		// Item item = new Item("Name", "Desc", 0l);
		// System.out.println(item.getName() + " " + item.getDescription());

		// // Task task = new Task("Name", "Desc");
		// Item task = new Task("Name", "Desc");
		// System.out.println(task.getName() + " " + task.getDescription());

		Tracker tracker = new Tracker();

		tracker.items[0] = new Item("Name", "Desc", 0l);
		tracker.items[1] = new Task("Name", "Desc");
		tracker.items[2] = new Bug();

		for (Item item : tracker.items) {
			if( item instanceof Task) {
				System.out.println(( (Task) item).calculatePrice());					
			}
			System.out.println(item.getName() + " " + item.getDescription());	
		}
	}*/
	
}