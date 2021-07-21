package com.rest.api.RESTAPIdemo.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.RESTAPIdemo.courses.bean.Course;

// for JpaRepository specify which Entity to manage and the id type

public interface CourseRepository extends JpaRepository<Course, Long> {

}
