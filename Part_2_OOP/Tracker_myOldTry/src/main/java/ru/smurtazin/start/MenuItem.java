package ru.smurtazin.start;

import ru.smurtazin.models.*;

public interface MenuItem {

	String itemName;
	// Action[] actions;
	public MenuItem (String itemName) {
		this.itemName = itemName;
	}
}