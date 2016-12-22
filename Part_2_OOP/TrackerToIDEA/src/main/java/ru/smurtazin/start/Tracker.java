package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Random;
import java.util.ArrayList;

public class Tracker {

	public ArrayList<Item> items = new ArrayList<Item>();

	private static final Random RN = new Random(System.currentTimeMillis());

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items.add(item);
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

	void update(Item item) {
        items.set( items.indexOf(item), item );
	}
	ArrayList<Item> findAll() {
		return this.items;
	}
	void delete(Item item) {
        items.set( items.indexOf(item), null );
    }
	public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result_array = new ArrayList<Item>();
		for (Item item : this.items) {
            if (item.getName().contains(key)) {
                result_array.add(item);
            }
        }
		return result_array;
	}

}