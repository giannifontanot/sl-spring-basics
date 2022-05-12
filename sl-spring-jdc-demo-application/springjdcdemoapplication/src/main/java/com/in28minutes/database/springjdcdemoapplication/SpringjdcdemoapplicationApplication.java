package com.in28minutes.database.springjdcdemoapplication;

import com.in28minutes.database.springjdcdemoapplication.entity.Person;
import com.in28minutes.database.springjdcdemoapplication.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringjdcdemoapplicationApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao dao;
    public static void main(String[] args) {

        SpringApplication.run(SpringjdcdemoapplicationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", dao.findAll());
        logger.info(" findById -> {}", dao.findById(1));
        logger.info(" deleteById -> {}", dao.deleteById(1));
        logger.info(" insert -> {}", dao.insert(new Person(5,"tara", "Berlin", new Date())));
        logger.info(" update -> {}", dao.update(new Person(2,"Luis", "Zambia", new Date())));
    }
}
