package com.first.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

/*
 * Creating a CRUD repository to manage the Entity Car .
 *  The CrudRepository angle brackets indicates that it's of type Car and the id is of type Long.
 */
public class CarRepository implements CrudRepository<Car, Long> {
 
}
