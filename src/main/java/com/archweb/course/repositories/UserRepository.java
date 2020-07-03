package com.archweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
