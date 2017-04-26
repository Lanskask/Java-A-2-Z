package ru.smurtazin.spring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 25.04.17.
 */
public class UserStorageTest {
    @Test
    public void when_addUserToStorage_should_save() throws Exception {
        MemoryStorage memory = new MemoryStorage();
        UserStorage storage = new UserStorage(memory);
        storage.add(new User());
    }

}