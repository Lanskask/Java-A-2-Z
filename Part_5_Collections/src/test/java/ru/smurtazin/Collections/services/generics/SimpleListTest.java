package ru.smurtazin.Collections.services.generics;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 22.02.17.
 */
public class SimpleListTest {

    public class A {}
    public class B extends A {}
    public class C extends B {}

    @Test
    public void when_CreateContainer_should_ReturnTheSameType() {
        SimpleList<String> simpleList = new SimpleList(4);

        simpleList.add("string1");
        simpleList.add("string2");
        String result = simpleList.get(1);

        assertThat(result, is("string2"));
    }

    @Test
    public void when_Int_should_ReturnInt() {
        SimpleList<Integer> simpleList = new SimpleList(4);

        simpleList.add(1);
        simpleList.add(2);
        int result = simpleList.get(1);

        assertThat(result, is(2));
    }

    @Test
    public void testingGetClasses() {
        SimpleList<Integer> simpleList = new SimpleList(4);

        simpleList.add(1);
        simpleList.add(2);

        System.out.println(simpleList.getClass());
        System.out.println(simpleList.get(0).getClass());
    }

    @Test
    public void wildTest() {
        SimpleList<A> list = new SimpleList<A>(10);
//        list.add(new A());
        list.add(new B());
        list.add(new C());

        print(list);
        Class thisClass = list.get(0).getClass();

//        thisClass[] clArray = new thisClass[3];
        System.out.println(thisClass);
        System.out.println(list.get(0).getClass());

//        printUpper((SimpleList<? extends B>) list);

        printLower(list);
    }

    public void print(SimpleList<?> list) {
        // todo this method
//        System.out.print("Your list: ");
        /*for (? item : list) {
            System.out.println(item + ", ");
        }
        System.out.println();*/
    }

    public void printUpper(SimpleList<? extends B> list) {

    }

    public void printLower(SimpleList<? super B> list) {

    }

}