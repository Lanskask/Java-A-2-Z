package ru.smurtazin.start;

import ru.smurtazin.models.Item;

import java.util.ArrayList;

/**
 * Created by a1 on 28.03.17.
 */
public interface Tracker {

    Item add(Item item);
    void update(Item item);
//    void update(String items_id, String items_name, String items_description);
//    void update(String items_id, String items_name);
    void delete(String id);
    ArrayList<Item> findAll();
    ArrayList<Item> findByName(String key);

}
