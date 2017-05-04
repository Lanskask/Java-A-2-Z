package ru.smurtazin.simple_servlets;

import javax.faces.bean.ManagedBean;

/**
 * Created by a1 on 03.05.17.
 */
@ManagedBean(name = "hello")
public class Hello {

    final String world = "Hello World!";

    public String getworld() {
        return world;
    }
}