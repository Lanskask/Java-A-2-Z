package ru.smurtazin.start;

import ru.smurtazin.models.Task;
import ru.smurtazin.models.Item;

public class StartUI {

	private Input input;

	private int[] ranges = new int[] {1, 2, 3, 4};
	/*private int[] ranges(int menuOptionsLength) {
		int[] rangesArray = new int[menuOptionsLength];
		for (new i = 0; i !=  menuOptionsLength.length; i++) {
			rangesArray[i] = i;
		}
		return rangesArray;
	}*/

	public StartUI(Input input) {
		this.input = input;
	}

	public void init() {
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillAction();
		UserAction deleteAction = new UserAction() {
				public int key() {
					return 3;
				}
				public void execute(Input input, Tracker tracker) {
					// TODO 
				}
				public String info() {
					return "3. Delete.";
				}
		};
		menu.addAction(deleteAction);

		do {
			menu.show();
			// int key = Integer.valueOf(input.ask("Select: "));
			menu.select(input.ask("Select: ", ranges));
		} while(! "y".equals(this.input.ask("Exit?(y):")));
	}

	public static void main(String[] args) {
		// Input input = new StubInput(new String[] {"create stub task"});
		// Input input = new ConsoleInput();
		Input input = new ValidateInput();
		new StartUI( input ).init();
	}
}