package com.first.cardatabase.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * The Entity annotation is used to specified that the class is a table .
 *  The Entity fields are mapped by the database columns . 
 * The column properties can be changed with the annotation @columns
 */
@Entity

public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String Brand, Model, Color, RegisterNumber;
  private int Year, Price;

  @Column(name = "Explanation", nullable = false, length = 512)
  private String Description;

  Car() {
  }

  Car(String Brand, String Model, String Color, String RegisterNumber, int Year, int Price,
      String Description) {
    this.Brand = Brand;
    this.Model = Model;
    this.Color = Color;
    this.RegisterNumber = RegisterNumber;
    this.Year = Year;
    this.Price = Price;
    this.Description = Description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
}
