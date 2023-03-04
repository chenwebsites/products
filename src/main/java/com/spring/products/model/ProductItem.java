package com.spring.products.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private AnimalType animal;
	
	private String brand;
	
	private int weight;
	
	private double price; 
	
	
	
}
