package com.first.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.first.cardatabase.domain.CarRepository;
import com.first.cardatabase.domain.Owner;
import com.first.cardatabase.domain.OwnerRepository;

@SpringBootApplication
@RestController
public class CardatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);

	}

	@GetMapping("")
	public String gretting(@RequestParam(value = "pseudo", defaultValue = "Bro") String pseudo) {
		return String.format("Yo %s", pseudo);

	}

	/*
	 * The @Autowired enables us to load dependecies to ours class .
	 * If not used the variable of the pointer may arise to a NullPointException.
	 * 
	 */
	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository user;

	Owner owner1 = new Owner("Fitzgerald", "Mouliom");
	Owner owner2 = new Owner("Emmanuel", "Nsangou");

	@Override
	public void run(String... args) throws Exception {

		// user.saveAll(Arrays.asList(owner1,owner2));
		// repository.save(new Car("Ford", "Mustang", "Black", "X-cobra", 2010,
		// 10000000, "Style mexicain",owner1));
		// repository.save(new Car("Mercedes", "4matic", "white", "xxx", 2015, 20000000,
		// "Elle je l'adore",owner2));
		// repository.save(new Car("Nissan", "Leaf", "Orange", "f29f29", 2019, 4450000,
		// "Cool cette voiture Orange",owner1));

	}

}