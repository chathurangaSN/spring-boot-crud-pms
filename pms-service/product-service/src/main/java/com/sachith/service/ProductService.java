package com.sachith.service;

import java.util.List;
import java.util.Optional;

import com.sachith.model.Product;

public interface ProductService {

	Product save(Product product);
	
	List<Product> fetchAll();

	Optional<Product> fetchOne(Integer id);

	Product update(Product product, Integer id);

	void delete(Integer id);

}