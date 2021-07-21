package com.rest.api.RESTAPIdemo.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.RESTAPIdemo.courses.bean.Course;
import com.rest.api.RESTAPIdemo.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return repository.findAll();

//		return Arrays.asList(new Course(1, "Learn Java", "Man Manovich"));
	}

	@GetMapping("/courses/{id}")
	public Course getCourseDetails(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		if (course.isEmpty())
			throw new RuntimeException("Course not found with id " + id);
		return course.get();
	}

	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}

	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}

	// docker run --detach
	// --env MYSQL_ROOT_PASSWORD=dummypassword
	// --env MYSQL_USER=courses-user
	// --env MYSQL_PASSWORD=dummycourses
	// --env MYSQL_DATABASE=courses
	// --name mysql
	// --publish 3306:3306 mysql:5.7

}
