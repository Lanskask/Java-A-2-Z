package ru.smurtazin.spring.simpleweb.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.smurtazin.spring.simpleweb.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
