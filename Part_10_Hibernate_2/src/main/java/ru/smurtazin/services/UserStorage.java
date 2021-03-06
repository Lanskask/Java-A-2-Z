package ru.smurtazin.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ru.smurtazin.hibmodels.Item;
import ru.smurtazin.hibmodels.User;

import java.sql.SQLException;
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

    /**
     * Just create one this.item
     */
    void experFunc() {
        this.item.setDesc("Item1 description");
        this.item.setCreated(new Timestamp(System.currentTimeMillis()));
        this.item.setAuthor(new User());
    }

    /**
     * Creates or Updates one User - newUser
     * Insert newUser into Database
     *
     * @param newUser
     */
    void create(User newUser) {
		this.user.setId(newUser.getId());
		this.user.setLogin(newUser.getLogin());
		this.user.setPassword(newUser.getPassword());
		this.user.setCreated(newUser.getCreated());

		this.session.saveOrUpdate(this.user);
	}

	/**
	 * Updates (not create&&||update) one User - newUser
	 * @param newUser
	 */
	void update(User newUser) {
		this.user.setId(newUser.getId());
		this.user.setLogin(newUser.getLogin());
		this.user.setPassword(newUser.getPassword());
		this.user.setCreated(new Timestamp(System.currentTimeMillis()));

		this.session.update(this.user);
	}

	/**
	 * Delete one user
	 * Check through: assertThat(userStorage.users, is(arrayToCompareWith.remove(User)) );
	 * @param newUser
	 */
	void delete(User newUser) {
		this.user.setId(newUser.getId());

		this.session.delete(this.user);
	}

	/**
	 * List of all Users.
	 * get throw: UsesrStorage.users;
	 */
	void readUsers() {
		this.users = this.session.createQuery("from User").list();
	}

    User findUserById(int id) {

        String hql = "FROM User WHERE id = :id";
        Query query = this.session.createQuery(hql);
        query.setParameter("id", id);
        List<User> userList = query.list();
        User user;

        try {
            user = userList.get(0);
            return user;
        } catch (Exception e) {
            System.out.println("error");
            return null;
        }
    }

    /**
     * List of all Items.
     * get through: UsesrStorage.items;
     */
    void readItems() {
        this.items = this.session.createQuery("from Item").list();
    }

    /**
     * Print Users logins
     */
    void printUsers() {
        for (User user : this.users) {
            System.out.println(user.getLogin());
        }
    }

    /**
     * Print Items.toString
     */
    void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }

}
