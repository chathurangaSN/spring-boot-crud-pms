package com.sachith.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachith.model.Product;
import com.sachith.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product save(Product employee){
		return productRepository.save(employee);
	}

	@Override
	public List<Product> fetchAll(){
		return productRepository.findAll();
	}
	
	@Override
	public Optional<Product> fetchOne(Integer id){
		return productRepository.findById(id);
//		return employeeRepository.
	}
	
	@Override
	public Product update(Product product, Integer id){
		product.setId(id);
		return productRepository.save(product);
	}
	
	@Override
	public void delete(Integer id){
		productRepository.deleteById(id);
	}
}
