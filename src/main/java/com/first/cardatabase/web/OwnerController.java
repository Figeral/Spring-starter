package com.first.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.cardatabase.domain.Owner;
import com.first.cardatabase.domain.OwnerRepository;


@RestController
public class OwnerController {
    @Autowired
    private OwnerRepository ownerRepo;
    
    @RequestMapping(value="/owners")
    Iterable<Owner> getOwners(){
        return ownerRepo.findAll();
    }

}
