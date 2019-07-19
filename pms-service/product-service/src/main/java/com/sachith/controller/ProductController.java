package com.sachith.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachith.model.Product;
import com.sachith.service.ProductService;

@RestController
@CrossOrigin()
@RequestMapping(value="/api")
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value ="/product", method = RequestMethod.POST)
	public Product save(@RequestBody Product employee){
		return productService.save(employee);
	}
	
	@RequestMapping(value ="/product", method = RequestMethod.GET)
	public List<Product> fetchAll(){
		return productService.fetchAll();
	}
	
	@RequestMapping(value ="/product/{id}", method = RequestMethod.GET)
	public Optional<Product> fetchOne(@PathVariable Integer id){
		return productService.fetchOne(id);
	}
	
	@RequestMapping(value ="/product/{id}", method = RequestMethod.PUT)
	public Product update(@RequestBody Product employee, @PathVariable Integer id){
		return productService.update(employee,id);
	}
	@RequestMapping(value ="/product/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
		productService.delete(id);
	}
	
	
	
	
}
