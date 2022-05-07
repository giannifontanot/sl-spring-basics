package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String location;
    private Date birth_date;

    public Person(){

    }
    public Person(int id, String name, String location, Date birth_date) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
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
