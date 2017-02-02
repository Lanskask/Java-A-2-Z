package ru.smurtazin.spring.hello;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by a1 on 29.01.17.
 */
public class GreeterTest {

    Greeter greeter = new Greeter();

    @Test
    public void sayHello() throws Exception {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

}