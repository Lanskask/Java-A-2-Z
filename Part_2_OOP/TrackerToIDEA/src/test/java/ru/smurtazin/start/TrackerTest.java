package ru.smurtazin.start;

import org.junit.Ignore;
import ru.smurtazin.models.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import java.util.Arrays;
import java.util.Date;

public class TrackerTest {

//	@Before
//	private void setUp() {
      Item resultItem;
	  String task_name;
	  String task_description;
	  Date task_date;

	  Date thisDate = new Date();
	  Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
      Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
      Tracker tracker = new Tracker();
      StartUI startUI = new StartUI();
//	}

	/*// Functions Content
	Item add(Item);
	void update(Item); - метод должен заменить ячейку в массиве. найти ячейку надо по циклу сравнивая getId
	void delete(Item);
	Item[] findAll();
	Item[] findByName(String key);
	Item findById(String id);*/

    @Ignore
    @Test
    public void add() throws Exception {
        tracker.add(newItem1);

        assertEquals(newItem1, tracker.items[0] );
    }
    @Ignore
    @Test
    public void update() throws Exception {
//      items[Arrays.asList(items).indexOf( findById( item.getId() ) )] = item;
        Item newItem = new Item("name2 newItem", "description2 newItem", new Date());
        newItem.setId(newItem1.getId());
        tracker.update(newItem);
        assertEquals(newItem, tracker.items[0] );
    }
    @Ignore
    @Test
    public void delete() throws Exception {
        Item newItem = new Item("name2 newItem", "description2 newItem", new Date());
        tracker.add(newItem);
        tracker.delete(newItem);
        assertEquals(null, tracker.items[0] );
    }
    @Test
    public void findAll() throws Exception {
        tracker.add(newItem1);
        tracker.add(newItem2);
//        Item[] findAll();
        assertArrayEquals(tracker.findAll(), new Item[]
                {newItem1, newItem2, null, null, null, null, null, null, null, null, });
    }
    @Ignore
    @Test
    public void findByName() throws Exception {
        fail("Not implemented.");
    }
    @Ignore
    @Test
    public void findById() throws Exception {
        fail("Not implemented.");
    }

}