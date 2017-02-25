package ru.smurtazin.Collections.services.generics;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 22.02.17.
 */
public class SimpleArrayTest {

    public class A {}
    public class B extends A {}
    public class C extends B {}

    @Test
    public void when_CreateContainer_should_ReturnTheSameType() {
        SimpleArray<String> simpleArray = new SimpleArray(4);

        simpleArray.add("string1");
        simpleArray.add("string2");
        String result = simpleArray.get(1);

        assertThat(result, is("string2"));
    }

    @Test
    public void Stack_when_CreateContainer_should_ReturnTheSameType() {
        Stack simpleArray = new Stack(4);

        simpleArray.add("string1");
        simpleArray.add("string2");
        String result = simpleArray.get(1);

        assertThat(result, is("string2"));
    }

    @Ignore
    @Test
    public void when_Int_should_ReturnInt() { // TODO tested
        SimpleArray<Integer> simpleArray = new SimpleArray(4);

        simpleArray.add(1);
        simpleArray.add(2);
        int result = simpleArray.get(1);

        assertThat(result, is(2));
    }

    @Ignore
    @Test
    public void testingGetClasses() {
        SimpleArray<Integer> simpleArray = new SimpleArray(4);

        simpleArray.add(1);
        simpleArray.add(2);

        System.out.println(simpleArray.getClass());
        System.out.println(simpleArray.get(0).getClass());
    }

    @Ignore
    @Test
    public void wildTest() {
        SimpleArray<? super A> list = new SimpleArray<A>(10);
        list.add(new A());
        list.add(new B());
        list.add(new C());

        print(list);
        Class thisClass = list.get(0).getClass();

//        thisClass[] clArray = new thisClass[3];
        System.out.println(thisClass);
        System.out.println(list.get(0).getClass());

//        printUpper((SimpleArray<? extends B>) list);

        printLower(list);
    }

    public void print(SimpleArray<?> list) {
        // todo this method
//        System.out.print("Your list: ");
        /*for (? item : list) {
            System.out.println(item + ", ");
        }
        System.out.println();*/
    }

    public void printUpper(SimpleArray<? extends B> list) {

    }

    public void printLower(SimpleArray<? super B> list) {

    }

}