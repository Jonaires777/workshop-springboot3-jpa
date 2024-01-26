package com.jonaires.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonaires.course.entities.Product;
import com.jonaires.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository; 	
	
	public List<Product> findAll(){
		return userRepository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional<Product> obj = userRepository.findById(Id);
		return obj.get();
	}
}
