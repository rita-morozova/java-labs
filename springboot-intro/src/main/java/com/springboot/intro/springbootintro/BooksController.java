package com.springboot.intro.springbootintro;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	// GET request
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1, "Learn Java", "Phil Collins"));
	}

}
