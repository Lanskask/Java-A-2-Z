package ru.smurtazin.servlets;

import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 21.04.17.
 */
public class DBServiceTest {

    DBService dbService = new DBService();

//    @Before
    public ArrayList<User> createUsersArray() {
        ArrayList<User> arrayToCheckWith = new ArrayList<User>();

        arrayToCheckWith.add(new User(1, "Dalida", "Dal28", "dal@mail.df",
                new Timestamp(2017, 04, 21, 18,12, 8, 000005764)));
        arrayToCheckWith.add(new User(2, "Delon", "Delon", "delon@dmail.df",
                new Timestamp(2017, 1, 11, 18, 12, 8, 000005764)));
        arrayToCheckWith.add(new User(3, "Serge", "Sergio", "serg@mail.rg",
                new Timestamp(2017, 3, 2, 18, 12, 8, 000005764)));
        arrayToCheckWith.add(new User(4, "Michael", "Micha", "mich@mail.jh",
                new Timestamp(2017, 7, 30, 18, 12, 8, 000005764)));

        return arrayToCheckWith;
    }

    @Test
    public void isConnection() throws Exception {
        assertTrue(dbService.isConnection());
    }

    @org.junit.Test
    public void add() throws Exception {

    }

    @org.junit.Test
    public void update() throws Exception {

    }

    @org.junit.Test
    public void delete() throws Exception {

    }

    @org.junit.Test
    public void findAll() throws Exception {
        DBService dbService = new DBService();
        for (User user :
                dbService.findAll()) {
            System.out.println(user);
        }
        assertThat(dbService.findAll(), is(this.createUsersArray()));
//        dbService.findAll();
    }

    @org.junit.Test
    public void findByName() throws Exception {

    }

}