package ru.smurtazin.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by a1 on 08.04.17.
 */
public class UserStorage {
    public static final Logger log = LoggerFactory.getLogger(UserStorage.class);

    public static final UserStorage instance = new UserStorage();

    private List<User> users = new CopyOnWriteArrayList<User>();

    public UserStorage() {
    }

    public static UserStorage getInstance() {
        return instance;
    }

    public void add(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return this.users;
    }

    
}