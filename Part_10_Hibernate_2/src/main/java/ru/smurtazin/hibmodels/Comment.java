package ru.smurtazin.hibmodels;

/**
 * Created by a1 on 02.05.17.
 */
public class Comment {

    private int id;
    private String text;

    public Comment() {
    }

    public Comment(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
