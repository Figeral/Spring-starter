package com.first.cardatabase.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String FirstName, LastName;
    List<Car> car;

    public Owner(){}

    public Owner(String FirstName,String LastName,List<Car> car){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.car=car;
    }

    public String getFirstName(){
        return this.FirstName;
    }
    public void setFirstName(String FN){
        this.FirstName=FN;
    }

    public String getLastName(){
        return this.LastName;
    }
    public void setLastName(String LN){
        this.LastName=LN;
    }
    
    public List<Car> getCar(){
        return this.car;
    }
    public void setCar(List<Car> car) {
        this.car = car;
    } 
    
}
