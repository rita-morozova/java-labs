package com.jdbc.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.jdbc.databasedemo.entity.Person;
import com.jdbc.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 100001 -> {}", dao.findById(100001));
		logger.info("Deleteing 100002 -> No of Rows Deleted - {}", dao.deleteById(100002));
		logger.info("Insert 100004 -> {}", dao.insert(new Person(100004, "Sam", "NY", new Date())));
		logger.info("Update 100004 -> {}", dao.update(new Person(100004, "SAM", "NY", new Date())));

	}

}
