package ru.smurtazin.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import ru.smurtazin.hibmodels.User;

/**
 * Created by a1 on 28.05.17.
 */
public class UserStorageTest {

	UserStorage userStorage;

	@Before
	public void setUp() throws Exception {
		this.userStorage = new UserStorage();
	}

	@Test
	public void create() throws Exception {
		User user = new User();
		user.setLogin("login1");
		user.setPassword("password1");
		this.userStorage.create(user);
		assertThat(user, is(userStorage.findById(user.getId()));
	}

	@Test
	public void update() throws Exception {

	}

	@Test
	public void delete() throws Exception {

	}

	@Test
	public void readUsers() throws Exception {

	}

	@Test
	public void readItems() throws Exception {

	}

}