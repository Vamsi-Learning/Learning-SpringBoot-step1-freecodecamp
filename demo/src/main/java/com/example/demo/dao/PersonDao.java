package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> getAllPerson();
    Optional<Person>  getPerson(UUID id);
    int deletePerson(UUID id);
    int updatePerson(UUID id, Person person);
}
