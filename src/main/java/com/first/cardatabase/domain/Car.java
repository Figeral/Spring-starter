package com.first.cardatabase.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/*
 * The Entity annotation is used to specified that the class is a table .
 *  The Entity fields are mapped by the database columns . 
 * The column properties can be changed with the annotation @columns
 */
@Entity
@Table

public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long car_id;

  private String Brand, Model, Color, RegisterNumber;
  private int Year, Price;
  
 
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "owner")
   private Owner owner;

  @Column(name = "Explanation", nullable = true, length = 512)
  private String Description;

  public Car() {
  }

  public Car(String Brand, String Model, String Color, String RegisterNumber, int Year, int Price,
      String Description, Owner owner) {
    this.Brand = Brand;
    this.Model = Model;
    this.Color = Color;
    this.RegisterNumber = RegisterNumber;
    this.Year = Year;
    this.Price = Price;
    this.Description = Description;
    this.owner=owner;
  }

  public long getCar_id() {
      return car_id;
  }
  public void setCar_id(long car_id) {
      this.car_id = car_id;
  }

  public String getBrand() {
    return this.Brand;
  }

  public void setBrand(String Brand) {
    this.Brand = Brand;
  }

  public String getModel() {
    return this.Model;
  }

  public void setModel(String Model) {
    this.Model = Model;
  }

  public String getColor() {
    return this.Color;
  }

  public void setColor(String Color) {
    this.Color = Color;
  }

  public String getRegisterNumber() {
    return RegisterNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    RegisterNumber = registerNumber;
  }

  public int getYear() {

    return this.Year;
  }

  public void setYear(int Year) {

    this.Year = Year;
  }

  public int getPrice() {

    return this.Price;
  }

  public void setPrice(int Price) {

    this.Price = Price;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public Owner getOwner(){
    return this.owner;
  }
  public void setOwner( Owner owner){
    this.owner=owner;
  }
}
