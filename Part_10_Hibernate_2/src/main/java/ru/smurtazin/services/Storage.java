package ru.smurtazin.services;

import ru.smurtazin.hibmodels.User;

/**
 * Created by a1 on 02.05.17.
 */
public interface Storage {
    void create(User user);
    void read();
    void update(User user); // User with the same id, but with other parametres
    void delete(User user); // only ID can be used
}
