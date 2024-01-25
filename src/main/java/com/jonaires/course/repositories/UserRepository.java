package com.jonaires.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonaires.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
