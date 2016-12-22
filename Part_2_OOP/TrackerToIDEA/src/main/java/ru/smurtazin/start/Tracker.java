package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Random;
import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;

public class Tracker {

	/*public Tracker() {

	}*/

	public Item[] items = new Item[10];
//	public ArrayList<Item> items = new ArrayList<Item>();

	private int position = 0;

	private static final Random RN = new Random(System.currentTimeMillis());

	/*// Functions Content
	Item add(Item);
	void update(Item); - метод должен заменить ячейку в массиве. найти ячейку надо по циклу сравнивая getId
	void delete(Item);
	Item[] findAll();
	Item[] findByName(String key);
	Item findById(String id);*/

	public Item add(Item item) {	// TO TEST
//        items.
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	protected Item findById(String id) {// TO TEST
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
	/**
	 * - метод должен заменить ячейку в массиве. найти ячейку надо по циклу сравнивая getId
	 */
	void update(Item item) { // TO TEST
		items[Arrays.asList(items).indexOf( findById( item.getId() ) )] = item;
	}
	Item[] findAll() { // TO TEST
		return this.items;
	}
	void delete(Item item) {
		items[Arrays.asList(items).indexOf( findById( item.getId() ) )] = null;
	}

	public Item[] findByName(String key) { // TO TEST
		// With ArrayList
		/*ArrayList result_array = new ArrayList();
		for (Item item : this.items) {
    	if (item.getName().contains(key)) {
    		result_array.add(item)
    	}
    }*/

		// WithOut ArrayList
		Item[] result_array = new Item[items.length];
		int positionInResArr = 0;
		for (Item item : this.items) {
			if (item.getName().contains(key)) {
				result_array[positionInResArr++] = item;
			}
		}

		return result_array;
	}

}