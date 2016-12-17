package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Date;

public class StartUI {
	public static void main(String[] args) {
		Tracker tracker = new Tracker();

		Item newItem1 = new Item("newItem1 name", "newItem1 description", new Date() );
		tracker.add(newItem1);

		Item newItem2 = new Item("newItem2 name2", "newItem2 description2", new Date() );
		tracker.add(newItem2);

		tracker.showTasksList();
		
	}
}