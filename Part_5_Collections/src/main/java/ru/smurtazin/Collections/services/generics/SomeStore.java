package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 25.02.17.
 */
public class SomeStore implements Store {

    SimpleArray<Base> someStoreArray;
    int index = 0;

    public SomeStore() {}

    public SomeStore(int size) {
        this.someStoreArray = new SimpleArray<Base>(size);
    }

    // ------- Service methods -----------
    private String newId() {
        return Integer.toString(index++);
    }

    public int findIndexById(String id){
        int index = -1;

        int i = 0;
        for (Object base : this.someStoreArray.objects) {
            if ( ((Base) base).getId() != null &&
                    ((Base) base).getId().contentEquals(id) ) {
                index = i;
                break;
            }
            i++;
        }

        return index;
    }

    public void printIdsList() {
        for (Object base : this.someStoreArray.objects){
            if (base != null ) {
                System.out.print( ( (Base) base ).getId() + ", ");
            }
        }
        System.out.println();
    }

    // ------- Realisation -----------
    public void add(Base newValue) {
        newValue.setId(this.newId());
        this.someStoreArray.add(newValue);
    }

    public void update(String id, Base newValue) throws Exception {
        newValue.setId(id);

        int indById = this.findIndexById(id);
        if(indById != -1) {
            this.someStoreArray.update(indById, newValue);
        } else {
            throw new Exception("Nothing to upgrade: no such Id.");
        }
    }

    public Base get(String id) throws Exception {
        Base neededBase = null;
        int indById = this.findIndexById(id);
        if(indById != -1) {
            neededBase = this.someStoreArray.get(indById);
        } else {
            throw new Exception("Nothing to get back: no such Id.");
        }
        return neededBase;
    }

    public void delete(String id) throws Exception {
        int indById = this.findIndexById(id);
        if(indById != -1) {
            this.someStoreArray.delete(indById);
        } else {
            throw new Exception("Nothing to delete: no such Id.");
        }
    }

}
