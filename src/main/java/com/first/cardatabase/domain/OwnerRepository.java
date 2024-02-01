package com.first.cardatabase.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
