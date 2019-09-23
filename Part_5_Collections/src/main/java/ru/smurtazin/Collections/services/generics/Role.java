package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 24.02.17.
 */
public class Role extends Base {

    @Override
    void setId(String id) {
        this.id = id;
    }

    @Override
    String getId() {
        return this.id;
    }
}
