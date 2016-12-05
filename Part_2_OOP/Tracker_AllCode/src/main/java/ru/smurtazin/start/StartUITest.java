package ru.smurtazin.start;

public class StartUITest {
	
	public static void main(String[] args) {
		Input input = new StubInput(new String[] {"create stub task"});
		// Input input = new ConsoleInput();
		new StartUI( input ).init();
	}

}