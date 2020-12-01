package com.springboot.restAPIDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping(value = "/getAllBooks")
	public List<Book> getBooks() {
		return Arrays.asList(new Book(100, "Hobbyit", "JRTooken"));
	}

}
