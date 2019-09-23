package ru.smurtazin.repository;

import org.springframework.data.repository.CrudRepository;
import ru.smurtazin.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
