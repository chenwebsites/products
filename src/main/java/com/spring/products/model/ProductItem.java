package com.spring.products.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Entity
public class ProductItem {

	
	@Id
	@Column(nullable = false)
	private String id;
	
	@Column(nullable = false)
	private AnimalType animal;
	
	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private String Description; 
	
	@Column(nullable = false)
	private int weight;
	
	@Column(nullable = false)
	private double price;

	public ProductItem() {
		super();
	}

	public ProductItem(String id, AnimalType animal, String brand, String description, int weight, double price) {
		super();
		this.id = id;
		this.animal = animal;
		this.brand = brand;
		Description = description;
		this.weight = weight;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AnimalType getAnimal() {
		return animal;
	}

	public void setAnimal(AnimalType animal) {
		this.animal = animal;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductItem [id=" + id + ", animal=" + animal + ", brand=" + brand + ", Description=" + Description
				+ ", weight=" + weight + ", price=" + price + "]";
	} 
	
	
	
}
