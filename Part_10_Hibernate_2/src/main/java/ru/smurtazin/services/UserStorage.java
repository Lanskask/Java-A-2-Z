package ru.smurtazin.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.smurtazin.hibmodels.User;

/**
 * Created by a1 on 24.04.17.
 */
public class UserStorage {

    void run() {
        /*SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        User user = new User();
        user.setLogin("test");
        session.save(user);
//        System.out.println(session.createQuery("from User").list());
        session.getTransaction().commit();
        session.close();
        factory.close();*/
    }

    public static void main(String[] args) {
        /*UserStorage main = new UserStorage();
        main.run();*/

        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        User user = new User();
        user.setLogin("test");
        session.save(user);
//        System.out.println(session.createQuery("from User").list());
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
