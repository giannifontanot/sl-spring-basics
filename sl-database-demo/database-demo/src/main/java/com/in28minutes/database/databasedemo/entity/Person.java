package com.in28minutes.database.databasedemo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "Person.findAll", query = "select p from Person p")
})
public class Person {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String location;
    private Date birth_date;

    public Person() {

    }

    public Person(int id, String name, String location, Date birth_date) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Person(String name, String location, Date birth_date) {
        super();
        this.name = name;
        this.location = location;
        this.birth_date = birth_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Date getBirthDate() {
        return birth_date;
    }


    @Override
    public String toString() {
        return String.format("\nPerson{" +
                "id=" + this.id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birth_date=" + birth_date +
                '}');
    }

}
