package ru.smurtazin.start;

import ru.smurtazin.models.Item;
import java.util.Random;
import java.util.ArrayList;

public class CMDTracker implements Tracker {

	public ArrayList<Item> items = new ArrayList<Item>();

	private static final Random RN = new Random(System.currentTimeMillis());

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items.add(item);

		return item; // Shouldit return item or not?
	}

	protected Item findById(String id) {
		Item result = null;
		for (Item item : this.items) {
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

	public void update(Item item) { // TODO: Should it be public?
		Item itemToInsert = this.findById(item.getId());
		this.items.set(items.indexOf(itemToInsert), item);
	}

	public ArrayList<Item> findAll() {
		return this.items;
	}

	public void delete(String id) {
        this.items.remove( this.findById(id) );
    }

	public ArrayList<Item> findByName(String key) {
        ArrayList<Item> resultArray = new ArrayList<>();
		for (Item item : this.items) {
            if (item.getName().contains(key)) {
                resultArray.add(item);
            }
        }
		return resultArray;
	}

}