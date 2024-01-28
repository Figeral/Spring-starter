package com.first.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CardatabaseApplication {

	@GetMapping(path = "/Controller")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("hello %s", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);

	}

}