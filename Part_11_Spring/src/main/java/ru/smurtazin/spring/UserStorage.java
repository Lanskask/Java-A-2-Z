package ru.smurtazin.spring;

/**
 * Created by a1 on 25.04.17.
 */
public class UserStorage {
    private final Storage storage;

    public UserStorage(final Storage storage) {
        this.storage = storage;
    }

    public void add(User user) {
        this.storage.add(user);
    }
}
