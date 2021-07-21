package com.jdbc.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
