package ru.smurtazin.start;

import org.junit.Ignore;
import ru.smurtazin.models.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class CMDTrackerTest {

//	@Before
//	private void setUp() {
	  Date thisDate = new Date();
	  Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
      Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
      CMDTracker tracker = new CMDTracker();
//	}

    @Ignore
    @Test
    public void add() throws Exception {
        this.tracker.add(this.newItem1);

        assertEquals(this.newItem1, this.tracker.items.get(0) );
    }

    @Ignore
    @Test
    public void update() throws Exception {
        Item newItem = new Item("name2 newItem", "description2 newItem", new Date());

        this.tracker.add(newItem);
        newItem.setId(this.newItem1.getId());
        this.tracker.update(newItem);

        assertEquals(newItem, this.tracker.items.get(0) );
    }

    @Ignore
    @Test
    public void delete() throws Exception {
        Item newItem1 = new Item("name1 newItem", "description1 newItem", new Date());
        Item newItem2 = new Item("name2 newItem", "description2 newItem", new Date());
        this.tracker.add(newItem1);
        this.tracker.add(newItem2);

        this.tracker.delete(newItem1.getId());
        assertEquals(newItem2, this.tracker.items.get(0) );
    }

    @Ignore
    @Test
    public void findAll() throws Exception {
        this.tracker.add(this.newItem1);
        this.tracker.add(this.newItem2);
        ArrayList<Item> arrayToCampare = new ArrayList<Item>(Arrays.asList( this.newItem1, this.newItem2 ) );

        assertThat(this.tracker.findAll(), is(arrayToCampare));
    }

    @Ignore
    @Test
    public void findByName() throws Exception {
        this.tracker.add(this.newItem1);
        this.tracker.add(this.newItem2);
        String key = "name2";

        assertEquals(this.tracker.findByName(key), new ArrayList<Item>(Arrays.asList( this.newItem2 ) ));
    }

    @Ignore
    @Test
    public void findById() throws Exception {
        this.tracker.add(this.newItem1);
        this.tracker.add(this.newItem2);

        assertEquals(this.tracker.findById(this.newItem1.getId()), this.tracker.items.get(0) );
    }

}