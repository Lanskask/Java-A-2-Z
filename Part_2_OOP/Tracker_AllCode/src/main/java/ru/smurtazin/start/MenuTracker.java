package ru.smurtazin.start;

import ru.smurtazin.models.Task;
import ru.smurtazin.models.Item;

class EditItem implements UserAction {
	public int key() {
		return 2;
	}

	public void execute(Input input, Tracker tracker) {
		String id = input.ask("Please, enter the task's id: ");
		String name = input.ask("Please, enter the task's name: ");
		String desc = input.ask("Please, enter the task's desc: ");
		Task task = new Task(name, desc);
		task.setId(id);
		// tracker.edit(new Task(name, desc));
		tracker.edit(task);
	}

	public String info() {
		return String.format("%s. %s", this.key(), "Edit the new item.");
	}
}

public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[5];
	private int position = 0;

	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public void fillAction() {
		this.actions[position++] = this.new AddItem();
		// this.actions[1] = MenuTracker.new ShowItems();
		this.actions[position++] = new MenuTracker.ShowItems();
		this.actions[position++] = new EditItem();
	}

	public void addAction(UserAction action) {
		this.actions[position++] = action;
	}

	/*public static void test() {
		MenuTracker tr = new MenuTracker();
		AddItem item = new AddItem();
	}*/

	public void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}

	public void show() {
		for (UserAction action : this.actions) {
			if (action != null) System.out.println(action.info());
		}
	}

	private static class ShowItems implements UserAction {
		public int key() {
			return 1;
		}

		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.getAll()) {
				System.out.println(
					String.format("%s. %s", item.getId(), item.getName())
				);
			}
		}

		public String info() {
			return String.format("%s. %s", this.key(), "Show all items.");
		}
	}

	private class AddItem implements UserAction {
		public int key() {
			return 0;
		}

		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task's name: ");
			String desc = input.ask("Please, enter the task's desc: ");
			// Tracker tracker = new Tracker();
			tracker.add(new Task(name, 
				"First Task Description"));
		}

		public String info() {
			return String.format("%s. %s", this.key(), "Add the new item.");
		}
	}

}