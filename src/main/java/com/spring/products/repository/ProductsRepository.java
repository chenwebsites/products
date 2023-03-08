package com.spring.products.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;

import com.spring.products.model.ProductItem;

public interface ProductsRepository extends CrudRepository<ProductItem, Long> {

	List<ProductItem> getProductByBrand(String brand);
}
