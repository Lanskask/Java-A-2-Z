package ru.smurtazin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by a1 on 25.04.17.
 */
@Component
public class UserStorage {
    /*@Autowired
    private Storage storage;*/
    private /*final */Storage storage;

    public UserStorage(/*final */Storage storage) {
        this.storage = storage;
    }

    public void add(User user) {
        this.storage.add(user);
    }
}
