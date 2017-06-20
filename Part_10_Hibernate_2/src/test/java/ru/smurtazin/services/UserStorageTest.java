package ru.smurtazin.services;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import ru.smurtazin.hibmodels.User;
import static org.hamcrest.core.Is.is;

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

		assertThat(user, is( this.userStorage.findUserById(user.getId()) ));
	}

	@Ignore
	@Test
	public void update() throws Exception {

	}

	@Ignore
	@Test
	public void delete() throws Exception {

	}

	@Ignore
	@Test
	public void readUsers() throws Exception {

	}

	@Ignore
	@Test
	public void readItems() throws Exception {

	}

}