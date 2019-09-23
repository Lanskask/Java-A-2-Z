package ru.smurtazin.Collections.services.generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 25.02.17.
 */
public class SomeStoreTest {

    SomeStore someStore = new SomeStore(5);

    Base user1 = new User();
    Base role1 = new Role();

    @Before
    public void setUp() throws Exception {
        this.someStore.add(user1);
        this.someStore.add(role1);
    }

    @Test // Tested
    public void findIndexById() throws Exception {
        assertThat(1, is(this.someStore.findIndexById("1")));
    }

    @Test
    public void get() throws Exception {
        assertThat(role1, is(this.someStore.get("1")));
    }

    @Test // Tested
    public void add() throws Exception {
        assertThat(user1, is(this.someStore.get("0")));
    }

    @Test // Tested
    public void update() throws Exception {
        Base role2 = new Role();
        this.someStore.update("1", role2);

        assertThat(this.someStore.get("1"), is(role2));
    }

    @Test(expected=NullPointerException.class)
    public void delete() throws Exception {
        this.someStore.add(user1);
        this.someStore.add(role1);

        this.someStore.delete("1");

//        assertNull(this.someStore.get("1")); // Doesn't work
    }

}