package com.in28minutes.database.springjdcdemoapplication.jpa;

import com.in28minutes.database.springjdcdemoapplication.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {
    //connect to the database
    @PersistenceContext

    EntityManager entityManager;
    public List<Person> findAll(){
        TypedQuery<Person> query = entityManager.createNamedQuery("find_all_persons",Person.class);
        return query.getResultList();
    }
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
