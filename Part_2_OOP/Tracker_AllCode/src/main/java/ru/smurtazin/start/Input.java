package ru.smurtazin.start;

public interface Input {
	/* String ask(String );
		 String usersChoise(String )*/
	String ask(String question);

	int ask(String question, int[] range);
}