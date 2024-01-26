package com.jonaires.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonaires.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
