package ru.smurtazin.start;

import ru.smurtazin.models.Item;

import java.util.ArrayList;

/**
 * Created by a1 on 28.03.17.
 */
public interface Tracker {

    // TODO: What to do with it? Is it works?
    ArrayList<Item> items = new ArrayList<Item>();

    Item add(Item item);
    void update(Item item);
    void delete(String id);
    ArrayList<Item> findAll();
    ArrayList<Item> findByName(String key);

    Item findById(String id);
}
