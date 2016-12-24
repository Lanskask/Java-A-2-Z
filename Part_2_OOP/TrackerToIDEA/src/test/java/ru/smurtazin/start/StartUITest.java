package ru.smurtazin.start;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ru.smurtazin.models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 21.12.16.
 */
public class StartUITest {
//    @Before
//    public void setUp() throws Exception {
        /*Date thisDate = new Date();
        Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
        Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );*/
//    }

    @Ignore
    @Test
    public void addNewTask() throws Exception {
        Tracker tracker = new Tracker();
        Input inputOutput = new StubInput(new String[] {
                "newItem1 name",
                "newItem1 description"
        });
        StartUI startUI = new StartUI(inputOutput, tracker);
        startUI.addNewTask();
//        assertThat(tracker.findAll().get(0).getName(), is("newItem1 name"));

        Date thisDate = new Date();
//        assertThat(tracker.findAll().get(0).getCreationDate(), is(thisDate ));

        Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
//        assertThat(tracker.findAll().get(0), is(newItem1));
        assertTrue(tracker.findAll().get(0).equals(newItem1));
    }

//    @Ignore
    @Test
    public void editTask() throws Exception {
        Date thisDate = new Date();
        Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
        Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
        Tracker tracker = new Tracker();
        tracker.add(newItem1);
        tracker.add(newItem2);

        Input inputOutput = new StubInput(new String[] {
                tracker.items.get(0).getId(), // "Choose task's id: "
                "y",                          //"Do you want to change task's name? (y/n): "
                "newItem1 NEW_name",           //"Print task's name: "
                "y",                          // "Do you want to change task's description? (y/n): "
                "newItem1 NEW_description"     // "Print task's description: "
        });

        StartUI startUI = new StartUI(inputOutput, tracker);
        startUI.editTask();

        Item newNEWItem1 = new Item("newItem1 NEW_name", "newItem1 NEW_description",  thisDate);
        ArrayList<Item> resultedArray = new ArrayList<Item>(
                Arrays.asList(newNEWItem1, newItem2));

        startUI.showAllTasks();
//        assertThat(tracker.findAll(), is(resultedArray));
//        assertTrue(tracker.findAll().equals(resultedArray));

//        assertThat(tracker.findAll().get(0), is(newNEWItem1));
//        assertTrue(tracker.findAll().get(0).equals(newNEWItem1));

//        assertThat(tracker.findAll().get(0).getName(), is("newItem1 NEW_name"));
        assertTrue(tracker.findAll().get(0).getName().equals("newItem1 NEW_name"));
    }

    @Ignore
    @Test
    public void deleteTask() throws Exception {
        Date thisDate = new Date();
        Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
        Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );

        Tracker tracker = new Tracker();
        tracker.add(newItem1);
        tracker.add(newItem2);

        Input inputOutput = new StubInput(new String[] {
                tracker.items.get(0).getId(), // "Choose id of the task you want to delete: "
                "y",                          // "Are you sure to delete this task? (y/n): ");
                "y"                          // "Are you absolutely sure, that you want to detele this task? (y/n): "
        });
        StartUI startUI = new StartUI(inputOutput, tracker);

        startUI.deleteTask();

        assertThat(tracker.findAll().get(0), is(newItem2));
    }

    @Ignore
    @Test
    public void showFilteredList() throws Exception {

        Date thisDate = new Date();
        Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);

        Tracker tracker = new Tracker();
        Input inputOutput = new StubInput(new String[] {
                "Item1" //        "What sequence do you want to search between item's names? "
        });


        StartUI startUI = new StartUI(inputOutput, tracker);
        startUI.showFilteredList();
        assertThat(tracker.findAll().size(), is(0));
//        assertThat(tracker.findAll().get(0), is(newItem1));
    }
}