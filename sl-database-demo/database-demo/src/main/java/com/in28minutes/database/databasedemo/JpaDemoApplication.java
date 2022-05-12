package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {

        SpringApplication.run(JpaDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("findById -> {}", repository.findById(1));
        //logger.info("All user id=1 -> {}", dao.findById(1));
    }
}
