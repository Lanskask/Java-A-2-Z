package ru.smurtazin.start;

import java.util.*;

public class ValidateInput extends ConsoleInput {
	public int ask(String question, int[] range) {		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = super.ask(question, range);
				invalid = false;
			} catch (MenuOutException moe) {
				// moe.printStackTrace();
				System.out.println("PLease enter a key from menu: ");
			} catch (NumberFormatException nfe) {
				System.out.println("PLease enter a valid data again: ");
			}	
		} while (invalid);

		return value;
	}

}