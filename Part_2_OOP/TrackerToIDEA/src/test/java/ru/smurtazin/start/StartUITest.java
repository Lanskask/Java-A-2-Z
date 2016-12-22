package ru.smurtazin.start;

import org.junit.Before;
import org.junit.Test;
import ru.smurtazin.models.Item;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by a1 on 21.12.16.
 */
public class StartUITest {
    @Before
    public void setUp() throws Exception {
        Date thisDate = new Date();
        Item newItem1 = new Item("newItem1 name", "newItem1 description",  thisDate);
        Item newItem2 = new Item("newItem2 name2", "newItem2 description2", thisDate );
        Tracker tracker = new Tracker();
        StartUI startUI = new StartUI();
    }

    @Test
    public void addNewTask() throws Exception {

    }

}