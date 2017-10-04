package ru.smurtazin.service;

import ru.smurtazin.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAll();

    Person add(Person person);

}
