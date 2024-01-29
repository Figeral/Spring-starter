package com.first.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.first.cardatabase.domain.Car;
import com.first.cardatabase.domain.CarRepository;

@SpringBootApplication
@RestController
public class CardatabaseApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);

	}

	@RequestMapping(path = "")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("hello %s", name);
	}

	@Autowired
	private CarRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Car("Toyota","Yaris","Red","S-2000",2002,1000000,""));
		repository.save(new Car("Mercedes","Benz","white","M-100",1995,2000000,""));
		repository.findAll();
		
	}

}