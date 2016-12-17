package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Date;

public class StartUI {
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		// tracker.items[0] = null;

		Item newItem1 = new Item("newItem1 name", "newItem1 description", new Date() );
		
		tracker.add(newItem1);
		tracker.showTasksList();
		
	}
}