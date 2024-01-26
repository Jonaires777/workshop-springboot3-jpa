package com.jonaires.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonaires.course.entities.Category;
import com.jonaires.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository; 	
	
	public List<Category> findAll(){
		return userRepository.findAll();
	}
	
	public Category findById(Long Id) {
		Optional<Category> obj = userRepository.findById(Id);
		return obj.get();
	}
}
