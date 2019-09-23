package ru.smurtazin.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.smurtazin.domain.Person;
import ru.smurtazin.repository.PersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    @Autowired
    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> getAll() {
        return Lists.newArrayList(this.repository.findAll());
    }

    @Override
    public Person add(Person person) {
        return this.repository.save(person);
    }
}
