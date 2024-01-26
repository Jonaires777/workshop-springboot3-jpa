package com.jonaires.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonaires.course.entities.Order;
import com.jonaires.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository OrderRepository; 	
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj = OrderRepository.findById(Id);
		return obj.get();
	}
}
