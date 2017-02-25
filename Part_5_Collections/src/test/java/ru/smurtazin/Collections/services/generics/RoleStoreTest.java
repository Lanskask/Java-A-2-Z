package ru.smurtazin.Collections.services.generics;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 25.02.17.
 */
public class RoleStoreTest<T> {

    RoleStore roleStoreArray = new RoleStore(5);
    Base role1 = new Role();
    Base user1 = new User();

    @Test
    public void add() throws Exception {
        this.roleStoreArray.add(role1);
        this.roleStoreArray.add(user1);

        assertThat(this.roleStoreArray.get(0), is(role1));
    }

    @Test
    public void update() throws Exception {
        this.roleStoreArray.update(0, user1);

        assertThat(this.roleStoreArray.get(0), is(user1));
    }

    @Test
    public void delete() throws Exception {
        this.roleStoreArray.delete(0);

        assertNull(this.roleStoreArray.get(0));
    }

}