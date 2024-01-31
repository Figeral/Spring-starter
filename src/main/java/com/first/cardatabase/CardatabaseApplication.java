package com.first.cardatabase;

import java.util.Arrays;

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
import com.first.cardatabase.domain.Owner;
import com.first.cardatabase.domain.OwnerRepository;


@SpringBootApplication
@RestController
public class CardatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);

	}

	@RequestMapping(path = "/greeting")
	public String hello(@RequestParam(value = "name" , defaultValue = "world") String name) {
		return String.format("hello %s ", name);
	}

	/*
	 * The @Autowired enables us to load dependecies to ours  class . 
	 * If not used the variable of the pointer may arise to a NullPointException.
	 * 
	 */
	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository user;
	
	Owner owner1=new Owner("Fitzgerald","Mouliom");
	Owner owner2=new Owner("Emmanuel","Nsangou");
	
	
	@Override
	public void run(String... args) throws Exception {
		// repository.save(new Car("Toyota", "Yaris", "Red", "S-2000", 2002, 1000000, ""));
		// repository.save(new Car("Mercedes", "Benz", "white", "M-100", 1995, 2000000, ""));
		// user.save(new Owner("Fitzgerald","Mouliom"));
		// user.save(new Owner("Emmanuel","Nsangou"));
        // user.saveAll(Arrays.asList(owner1,owner2));
		// repository.save(new Car("Ford", "Mustang", "Black", "X-cobra", 2010, 10000000, "Style mexicain",owner1));
		// repository.save(new Car("Mercedes", "4matic", "white", "xxx", 2015, 20000000, "Elle je l'adore",owner2));
		// repository.save(new Car("Nissan", "Leaf", "Orange", "f29f29", 2019, 4450000, "Cool cette voiture Orange",owner1));


	}

}