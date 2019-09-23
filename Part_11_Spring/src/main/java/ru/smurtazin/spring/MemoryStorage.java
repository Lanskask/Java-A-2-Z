package ru.smurtazin.spring;

import org.springframework.stereotype.Component;

/**
 * Created by a1 on 25.04.17.
 */
@Component
public class MemoryStorage implements Storage {
    @Override
    public void add(User user) {
        System.out.println("User is added.");
    }
}
