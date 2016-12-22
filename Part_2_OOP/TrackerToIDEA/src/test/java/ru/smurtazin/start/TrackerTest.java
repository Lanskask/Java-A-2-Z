package ru.smurtazin.start;

import org.junit.Ignore;
import ru.smurtazin.models.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TrackerTest {

//	@Before
//	private void setUp() {
	  Date thisDate = new Date();
	  Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
      Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
      Tracker tracker = new Tracker();
//	}

    @Test
    public void add() throws Exception {
        tracker.add(newItem1);

        assertEquals(newItem1, tracker.items.get(0) );
    }
    @Test
    public void update() throws Exception {
        Item newItem = new Item("name2 newItem", "description2 newItem", new Date());
        tracker.add(newItem);
        newItem.setId(newItem1.getId());
        tracker.update(newItem);
        assertEquals(newItem, tracker.items.get(0) );
    }
    @Test
    public void delete() throws Exception {
        Item newItem = new Item("name2 newItem", "description2 newItem", new Date());
        tracker.add(newItem);
        tracker.delete(newItem);
        assertEquals(null, tracker.items.get(0) );
    }
    @Test
    public void findAll() throws Exception {
        tracker.add(newItem1);
        tracker.add(newItem2);
        ArrayList<Item> arrayToCampare = new ArrayList<Item>(Arrays.asList( newItem1, newItem2 ) );
        // TODO: How to compare to Lists?
        assertTrue(tracker.findAll().equals(arrayToCampare));
    }
    @Test
    public void findByName() throws Exception {
        tracker.add(newItem1);
        tracker.add(newItem2);
        String key = "name2";

        assertEquals(tracker.findByName(key), new ArrayList<Item>(Arrays.asList( newItem2 ) ));
    }
    @Test
    public void findById() throws Exception {
        tracker.add(newItem1);
        tracker.add(newItem2);

        assertEquals(tracker.findById(newItem1.getId()), tracker.items.get(0) );
    }

}