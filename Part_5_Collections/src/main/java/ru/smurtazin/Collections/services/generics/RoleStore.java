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

    // ------- Service methods -----------
    private String newId() {
        return Integer.toString(index++);
    }

    private int findIndexById(String id){
        int index = -1;

        for (int i = 0; i < this.roleStoreArray.objects.length; i++) {
            if (this.roleStoreArray.get(i).getId() == id) {
                index = i;
            }
        }

        return index;
    }

    public void printIdsList() {
        for (int i = 0; i < this.roleStoreArray.objects.length; i++) {
            System.out.println(
                    this.roleStoreArray.get(i).getId()
            );
        }

    }

    // ------- Realisation -----------
    public Base get(String id) {
        return this.roleStoreArray.get(
                this.findIndexById(id)
        );
    }

    public void add(Base newValue) {
        newValue.setId(this.newId());
        this.roleStoreArray.add(newValue);
    }

    public void update(String id, Base newValue) {
        this.roleStoreArray.update(
                this.findIndexById(id),
                newValue
        );
    }

    public void delete(String id) {
        this.roleStoreArray.delete(
                this.findIndexById(id)
        );
    }

}
