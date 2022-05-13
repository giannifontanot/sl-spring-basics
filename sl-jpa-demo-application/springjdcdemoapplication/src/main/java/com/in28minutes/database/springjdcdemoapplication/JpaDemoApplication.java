package com.in28minutes.database.springjdcdemoapplication;

import com.in28minutes.database.springjdcdemoapplication.entity.Person;
import com.in28minutes.database.springjdcdemoapplication.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;
    public static void main(String[] args) {

        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        logger.info("All users -> {}", repository.findAll());
        logger.info(" findById -> {}", repository.findById(1));
        logger.info(" update -> {}", repository.update(new Person(2,"Luis", "Zambia", new Date())));
        logger.info(" insert -> {}", repository.insert(new Person(4,"tara", "Berlin", new Date())));
        logger.info(" deleteById -> {}", repository.deleteById(1));
    }
}
