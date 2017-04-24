package ru.smurtazin.hibmodels;

import java.util.List;

/**
 * Created by a1 on 24.04.17.
 */
public class Item {
    private User author;
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
