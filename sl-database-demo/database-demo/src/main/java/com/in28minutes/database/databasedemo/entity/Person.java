package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

public class Person {
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
        return birthDate;
    }

    private int id;
    private String name;
    private String location;
    private Date birthDate;

    public Person(){

    }

    public Person(int id, String name, String location, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("\nPerson{" +
                "id=" + this.id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}');
    }
}
