package com.first.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

/*
 * Creating a CRUD repository interface to manage the Entity Car .
 *  The CrudRepository angle brackets indicates that it's of type Car and the id is of type Long.
 */
public interface CarRepository extends CrudRepository<Car, Long> {

}