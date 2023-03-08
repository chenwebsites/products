package com.spring.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.products.model.ProductItem;
import com.spring.products.repository.ProductsRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	ProductsRepository repository;

	public ProductsController(ProductsRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public ProductItem createProduct(@RequestBody ProductItem product) {
		return repository.save(product);
	}
	
	@GetMapping("/get-{brand}")
	public List<ProductItem> getBrandList(@PathVariable String brand){
		
		return repository.getProductByBrand(brand);
	}
	
}
