package com.first.cardatabase.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long owner_id;

    private  String FirstName, LastName;

    /*
     * The mappedBy attribute tells the Car class that it has field called Owner whis
     * is also the Foreign key.
     */
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "owner" )
    private List<Car> car;

    public Owner(){}

    public Owner(String FirstName,String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
    }

    public Long getOwner_id() {
        return owner_id;
    }
    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
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
