package ru.smurtazin.Collections.services.generics;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a1 on 22.02.17.
 */
public class SimpleArrayTest {

    @Test
    public void when_CreateContainer_should_ReturnTheSameType() {
        SimpleArray<String> simpleArray = new SimpleArray(4);

        simpleArray.add("string1");
        simpleArray.add("string2");
        String result = simpleArray.get(1);

        assertThat(result, is("string2"));
    }

    @Test
    public void when_Int_should_ReturnInt() {
        SimpleArray<Integer> simpleArray = new SimpleArray(4);

        simpleArray.add(1);
        simpleArray.add(2);
        int result = simpleArray.get(1);

        assertThat(result, is(2));
    }

    @Test
    public void Stack_when_CreateContainer_should_ReturnTheSameType() {
        Stack simpleArray = new Stack(4);

        simpleArray.add("string1");
        simpleArray.add("string2");
        String result = simpleArray.get(1);

        assertThat(result, is("string2"));
    }

}