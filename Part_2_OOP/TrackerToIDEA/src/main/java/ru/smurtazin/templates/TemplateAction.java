package ru.smurtazin.templates;

/**
 * Created by a1 on 17.01.17.
 */
public abstract class TemplateAction {

    abstract void start();
    abstract void finish();

    public void work() {
        this.start();
        this.finish();
    }

    public static void main(String[] args) {
//        new TemplateAction();
        new CopyAction();
    }
}
