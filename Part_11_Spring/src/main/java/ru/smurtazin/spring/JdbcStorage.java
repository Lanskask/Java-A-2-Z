package ru.smurtazin.spring;

/**
 * Created by a1 on 25.04.17.
 */
public class JdbcStorage implements Storage {
    @Override
    public void add(User user) {
        System.out.println("Store to memory");
    }
}
