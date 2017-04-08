package ru.smurtazin.servlets;

/**
 * Created by a1 on 08.04.17.
 */
public class User {

    String login;
    String emale;

    public User(String login, String emale) {
        this.login = login;
        this.emale = emale;
    }

    public String getLogin() {
        return login;
    }

    public String getEmale() {
        return emale;
    }
}

