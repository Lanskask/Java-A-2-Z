package ru.smurtazin.spring.hello;

import org.joda.time.LocalTime;

/**
 * Created by a1 on 29.01.17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}