package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 24.02.17.
 */
public abstract class Base {

    String id;

//    abstract String getId();
    String getId() {
        return this.id;
    }

    abstract void setId(String id);

}
