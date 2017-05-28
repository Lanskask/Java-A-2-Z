package ru.smurtazin.services;

import ru.smurtazin.hibmodels.User;


//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;

import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a1 on 28.05.17.
 */
public class UserStorageWithMockingTest {
	UserStorage userStorage;
	User userToWorkWith;

	int mockId;
	String mockLogin, mockPassword;
	Timestamp mockTimestemp;

	List<User> prepearedUsers() {
		List<User> prepearedUsers = new ArrayList<User>();
		User newUser1 = new User();
		newUser1.setId(1);
		newUser1.setLogin("login1");
		newUser1.setPassword("password1");
		newUser1.setCreated(mock(Timestamp.class));
		prepearedUsers.add(newUser1);

		User newUser2 = new User();
		newUser1.setId(2);
		newUser1.setLogin("login2");
		newUser1.setPassword("password2");
		newUser1.setCreated(mock(Timestamp.class));
		prepearedUsers.add(newUser2);

		return prepearedUsers;
	}

	@Before
	public void setUp() throws Exception {
		this.userStorage = new UserStorage();

		this.mockId = mock(Integer.class);
		this.mockLogin = mock(String.class);
		this.mockPassword = mock(String.class);
		this.mockTimestemp = mock(Timestamp.class);

		this.userToWorkWith = new User();
		this.userToWorkWith.setId(3);
		this.userToWorkWith.setLogin("login3");
		this.userToWorkWith.setPassword("password3");
		this.userToWorkWith.setCreated(mockTimestemp);

		when(userToWorkWith.getId()).thenReturn(mockId);
		when(userToWorkWith.getLogin()).thenReturn(mockLogin);
		when(userToWorkWith.getPassword()).thenReturn(mockPassword);
		when(userToWorkWith.getCreated()).thenReturn(mockTimestemp);
	}

	@Test
	public void testingMocking() {
		assertThat(userToWorkWith.getId(), is(this.mockId));
	}

	@Test
	public void experFunc_GetNothing_shouldReturn_Item() throws Exception {

	}

	@Test
	public void create() throws Exception {
//		this.userStorage.create();
//		getMock_from_H2-DB
	}

	@Test
	public void readUsers() throws Exception {
		this.userStorage.readUsers();
		assertThat(this.userStorage.users, is(prepearedUsers()));
	}

	@Test
	public void readItems() throws Exception {

	}

	@Test
	public void update() throws Exception {

	}

	@Test
	public void delete() throws Exception {

	}

}