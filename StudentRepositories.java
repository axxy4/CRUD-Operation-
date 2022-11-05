package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.entities.Student;

public interface StudentRepositories extends CrudRepository<Student, Long> {

	
	

}
