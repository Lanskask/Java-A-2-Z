package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Random;
import java.util.Date;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

// public class Tracker extends Item {
public class TrackerTest {
	
	@Test
	public void addNewTask()	throws Exception {
		Tracker tracker = new Tracker();

		Date thisDate = new Date();
		Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
		tracker.add(newItem1);

		// Item newItem2 = new Item("newItem2 name2", "newItem2 description2", new Date() );
		// tracker.add(newItem2);
		Item itemToTest =  tracker.items[0];
		assertEquals(itemToTest, newItem1);

		/*assertEquals(itemToTest.getName(), "newItem1 name");
		assertEquals(itemToTest.getDescription(), "newItem1 description");
		assertEquals(itemToTest.getCreationDate(), thisDate);*/
	}

	@Test
	public void showTasksList()	throws Exception {

	}

	@Test
	public void editTask()	throws Exception {
		
	}

	@Test
	public void addCommentToTask()	throws Exception {
		
	}

	@Test
	public void showTaskComments()	throws Exception {
		
	}

	@Test
	public void deleteTask()	throws Exception {
		
	}

	
}