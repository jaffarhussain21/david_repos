package com.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/getMyName/{name}")
	public String getHelloMyName(@PathVariable String name) {
		return String.format("Hello, %s", name);
	}

}
