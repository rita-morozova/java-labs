package com.rest.api.RESTAPIdemo.courses.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Automatically creates a table
@Entity
public class Course {

	@Id // use with the primary key
	@GeneratedValue // id will be automatically generated
	private long id;

	// Overwrites column name
	@Column(name = "course_name")
	private String name;
	private String author;

	public Course() {

	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
