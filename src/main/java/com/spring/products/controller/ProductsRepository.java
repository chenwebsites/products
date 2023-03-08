package com.spring.products.controller;

import org.springframework.data.repository.CrudRepository;

import com.spring.products.model.ProductItem;

public interface ProductsRepository extends CrudRepository<ProductItem, Long> {

}
