package com.in28minutes.database.springjdcdemoapplication.jpa;

import com.in28minutes.database.springjdcdemoapplication.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PersonJpaRepository {
    //connect to the database
    @PersistenceContext

    EntityManager entityManager;
    public Person findById(int id){
        return entityManager.find(Person.class,id);
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }
    public Person update(Person person){
        return entityManager.merge(person);
    }
    public int deleteById(int id){
        Person person = findById(id);
        entityManager.remove(person);
        return 1;
    }
}
