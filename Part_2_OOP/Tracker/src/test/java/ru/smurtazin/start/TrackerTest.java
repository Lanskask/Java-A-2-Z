package ru.smurtazin.start;

import ru.smurtazin.models.*;
import java.util.Random;
import java.util.Date;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// public class Tracker extends Item {
@RunWith(Parameterized.class)
public class TrackerTest {
	
	private Item resultItem;
  private String task_name;
  private String task_description;
  private Date task_date;

  static Date thisDate = new Date();
	static Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
	static Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
	Tracker tracker = new Tracker();
	StartUI startUI = new StartUI();

  public TrackerTest(Item resultItem, String task_name, String task_description, Date task_date) {
    this.resultItem = resultItem;
  	this.task_name = task_name;
  	this.task_description = task_description;
  	this.task_date = task_date;
  }
/*
	@Before
	private void setUp() {
		Date thisDate = new Date();
		Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
		Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
		Tracker tracker = new Tracker();
		StartUI startUI = new StartUI();
	}*/

  @Parameters
  public static Collection<Object[]> data() {
  	Object[][] data = new Object[][] {
    	{newItem1, "newItem1 name", "newItem1 description", thisDate}, 
    	{newItem2, "newItem2 name2", "newItem2 description2", thisDate}
  	};
  	return Arrays.asList(data);
  }  

  @Test
	public void addNewTask()	throws Exception {
		startUI.addNewTask();
		Item itemToTest =  tracker.items[0];
		assertEquals(itemToTest, newItem1);
	}

	// =============================================================
	/* // Should be run with this in pom.xml
	<dependency>
	  <groupId>pl.pragmatists</groupId>
	  <artifactId>JUnitParams</artifactId>
	  <version>1.0.5</version>
	  <scope>test</scope>
	</dependency>	*/
	@Test
  @Parameters({"17, false", 
               "22, true" })
  public void personIsAdult(int age, boolean valid) throws Exception {
    assertThat(new Person(age).isAdult(), is(valid));
  }

  // =============================================================
	// @Test
	// public void addNewTask()	throws Exception {
	// 	Tracker tracker = new Tracker();
	// 	StartUI startUI = new StartUI();

	// 	Date thisDate = new Date();
	// 	// Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
	// 	// tracker.add(newItem1);
	// 	startUI.addNewTask();

	// 	// Item newItem2 = new Item("newItem2 name2", "newItem2 description2", new Date() );
	// 	// tracker.add(newItem2);
	// 	Item itemToTest =  tracker.items[0];
	// 	assertEquals(itemToTest, newItem1);

	// 	/*assertEquals(itemToTest.getName(), "newItem1 name");
	// 	assertEquals(itemToTest.getDescription(), "newItem1 description");
	// 	assertEquals(itemToTest.getCreationDate(), thisDate);*/
	// }

/*
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
		
	}*/

	
}