package ru.smurtazin.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.smurtazin.hibmodels.Item;
import ru.smurtazin.hibmodels.User;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by a1 on 24.04.17.
 */
public class UserStorage {
    SessionFactory factory = new Configuration()
            .configure()
            .buildSessionFactory();
    Session session = this.factory.openSession();
    User user = new User();
    Item item = new Item();
    List<User> users;
    List<Item> items;

    public static void main(String[] args) {
        UserStorage main = new UserStorage();

        main.run();
    }

    void run() {
        this.session.beginTransaction();

//        this.create();
//        this.read();
//        this.printUsers();
//        this.update();
//        this.delete();
        this.experFunc(); // add Item
        this.readItems();
        this.printItems();

//        System.out.println(session.createQuery("from User").list());
        this.session.getTransaction().commit();
        this.session.close();
        this.factory.close();
    }

    void experFunc() {
        Item item = new Item();
        item.setDesc("Item1 description");
        item.setCreated(new Timestamp(System.currentTimeMillis()));
        item.setAuthor(new User());
    }

    void create(User newUser) {
//        this.user.setLogin("test"); // TODO: Remove comment - it's old variant
//        this.user = newUser; // TODO: or:
        this.user.setId(newUser.getId());
        this.user.setLogin(newUser.getLogin());
        this.user.setPassword(newUser.getPassword());
        this.user.setCreated(newUser.getCreated());

        this.session.saveOrUpdate(this.user);
    }

    void readUsers() {
        this.users = this.session.createQuery("from User").list();
    }

    void readItems() {
        this.items = this.session.createQuery("from Item").list();
    }

    void update(User newUser) {
        this.user.setId(newUser.getId());
        this.user.setLogin(newUser.getLogin());
        this.user.setPassword(newUser.getPassword());
        this.user.setCreated(new Timestamp(System.currentTimeMillis()));

        this.session.update(this.user);
    }

    void delete(User newUser) {
        this.user.setId(newUser.getId());

        this.session.delete(this.user);
    }

    void printUsers() {
        for (User user : this.users) {
            System.out.println(user.getLogin());
        }
    }

    void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }


}
