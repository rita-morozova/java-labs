package com.jdbc.databasedemo;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.databasedemo.entity.Person;
import com.jdbc.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 100001 -> {}", repository.findById(100001));

		logger.info("Insert 100004 -> {}", repository.save(new Person(100004, "Sam", "NY", new Date(0))));
		logger.info("Update 100004 -> {}", repository.save(new Person(100004, "SAM", "NY", new Date(0))));

		repository.deleteById(1);

		logger.info("All users -> {}", repository.findAll());

	}

}
