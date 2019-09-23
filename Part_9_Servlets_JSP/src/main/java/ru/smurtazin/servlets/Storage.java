package ru.smurtazin.servlets;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by a1 on 27.05.17.
 */
public interface Storage {

//	Storage instance;

	/*static Storage getInstance()  {
		return this;
	};*/

	void add(User user);

	List<User> getUsers();

}
