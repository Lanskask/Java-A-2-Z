package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 24.02.17.
 */
public class UserStore implements Store {

    SimpleArray<Base> userStoreArray;
    int index = 0;

    public UserStore(int size) {
        this.userStoreArray = new SimpleArray<Base>(size);
    }

    public void add(Base newValue) {
        this.userStoreArray.add(newValue);
    }

    public void update(int index, Base newValue) {
        this.userStoreArray.update(index, newValue);
    }

    public void delete(int index) {
        this.userStoreArray.delete(index);
    }

}