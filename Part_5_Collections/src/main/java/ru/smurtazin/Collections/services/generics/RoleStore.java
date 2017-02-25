package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 24.02.17.
 */
public class RoleStore implements Store {

    SimpleArray<Base> roleStoreArray;
    int index = 0;

    public RoleStore(int size) {
        this.roleStoreArray = new SimpleArray<Base>(size);
    }

    public void add(Base newValue) {
        this.roleStoreArray.add(newValue);
    }

    public void update(int index, Base newValue) {
        this.roleStoreArray.update(index, newValue);
    }

    public void delete(int index) {
        this.roleStoreArray.delete(index);
    }

}
