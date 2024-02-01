package com.first.cardatabase.domain;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface CarRepository extends CrudRepository<Car,Long> {
   
}
