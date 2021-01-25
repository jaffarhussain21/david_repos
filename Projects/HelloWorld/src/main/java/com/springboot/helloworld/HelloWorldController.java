package com.springboot.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping("/getMyName/{name}")
	public String getHelloMyName(@PathVariable String name) {
		return String.format("Hello, %s", name);
	}

	/*
	 * @GetMapping("/internationalized") public String
	 * getHelloInternationalized(@RequestHeader(name = "Accept-Language", required =
	 * false) Locale locale) { return
	 * messageSource.getMessage("good.morning.message", null, locale); }
	 */

	@GetMapping(path = "/internationalization")
	public String getMessage(@RequestHeader(name = "Accept-Language",required = false) Locale locale) {
		String message = messageSource.getMessage("good.morning.message", null, locale);
		message = message +" & "+ messageSource.getMessage("thankyou.message", null, locale);
		return message;
	}
}
