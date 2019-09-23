package ru.smurtazin.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by a1 on 25.04.17.
 */
public class UserStorageTest {

    @Test
    public void when_AddUserToStorage_should_SaveIt() {
        MemoryStorage memoryStorage = new MemoryStorage();
//        UserStorage userStorage = new UserStorage(memoryStorage);
        UserStorage userStorage = new UserStorage(memoryStorage);
        userStorage.add(new User());
    }

    @Test
    public void when_loadContext_should_geetBeans() {
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "spring-context.xml");
        UserStorage userStorage = ctx.getBean(UserStorage.class);
        userStorage.add(new User());
        assertNotNull(userStorage);
    }
}