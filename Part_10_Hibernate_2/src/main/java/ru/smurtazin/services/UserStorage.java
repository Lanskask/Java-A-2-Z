package ru.smurtazin.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
    List<User> users;

    public static void main(String[] args) {
        UserStorage main = new UserStorage();

        main.run();
    }

    void run() {
        this.session.beginTransaction();

//        this.create();
        this.read();
        this.printUsers();
//        this.update();
//        this.delete();

//        System.out.println(session.createQuery("from User").list());
        this.session.getTransaction().commit();
        this.session.close();
        this.factory.close();
    }

    void create() {
        this.user.setLogin("test");

        this.session.saveOrUpdate(this.user);
    }

    void read() {
        this.users = this.session.createQuery("from User").list();
    }

    void update() {
        this.user.setId(4);
        this.user.setLogin("murt");
        this.user.setCreated(new Timestamp(System.currentTimeMillis()));

        this.session.update(this.user);
    }

    void delete() {
        this.user.setId(4);

        this.session.delete(this.user);
    }

    void printUsers() {
        for (User user : this.users) {
            System.out.println(user.getLogin());
        }
    }
}
