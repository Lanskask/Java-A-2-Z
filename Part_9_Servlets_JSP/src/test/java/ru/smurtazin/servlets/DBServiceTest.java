package ru.smurtazin.servlets;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.sql.Timestamp;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

// TODO: How to say test. that it is unimportant concreet Timestamp, getted from DB?

/**
 * Created by a1 on 21.04.17.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBServiceTest {

	/*
	* MathOperationsToTest matToTest;

	@Before
	public void setUp() throws Exception {
//		this.matToTest = new MathOperationsToTest();
		this.matToTest = mock(MathOperationsToTest.class);
	}
	* */

    DBService dbService = new DBService();
		Timestamp timeStMock;

    User userToWorkWith;

    @Before
    public void setUp() {
        timeStMock = mock(Timestamp.class);
        userToWorkWith = new User(5, "Marsedy2", "Mars2", "mars22@mail.mr");
    }
//    @Before
    public ArrayList<User> createUsersArrayToCompareWith() {
        ArrayList<User> arrayToCheckWith = new ArrayList<User>();

        arrayToCheckWith.add(new User(1, "Dalida", "Dal28", "dal@mail.df", timeStMock));
        arrayToCheckWith.add(new User(2, "Delon", "Delon", "delon@dmail.df", timeStMock));
        arrayToCheckWith.add(new User(3, "Serge", "Sergio", "serg@mail.rg", timeStMock));
        arrayToCheckWith.add(new User(4, "Michael", "Micha", "mich@mail.jh", timeStMock));

        return arrayToCheckWith;
    }

    @Ignore
    @Test
    public void printAll() throws Exception {
        for (User user : this.dbService.findAll()) {
            System.out.println(user.toString());
        }
    }

//    @Ignore
    @Test
    public void test1_isConnection() throws Exception {
        assertTrue(this.dbService.isConnection());
    }

//    @Ignore
    @Test
    public void test2_add() throws Exception {
        this.dbService.add(this.userToWorkWith);
        assertThat(this.dbService.findByAllUser(this.userToWorkWith), is(this.userToWorkWith));
    }

//    @Ignore
    @Test
    public void test3_findByName() throws Exception {
        assertThat(dbService.findByName("Michael"), is(this.userToWorkWith));
    }

//    @Ignore
    @Test
    public void test4_update() throws Exception {
        dbService.update(userToWorkWith);
        assertThat(dbService.findByAllUser(userToWorkWith), is(userToWorkWith));
    }

//    @Ignore
    @Test
    public void test5_delete() throws Exception {
        this.dbService.delete(this.userToWorkWith);
        assertNull(this.dbService.findByAllUser(this.userToWorkWith));
    }

//    @Ignore
    @Test
    public void test6_findAll() throws Exception {
        assertThat(this.dbService.findAll(), is(this.createUsersArrayToCompareWith()));
    }

}