package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Student;
import com.demo.repositories.StudentRepositories;

@SpringBootTest
class CrudDemoApplicationTests {

	@Autowired
	private StudentRepositories studentRepo;
	
	
	@Test
	void saveOneStudent() {
		System.out.println(studentRepo);
		
		Student s = new Student ();
		s.setName("Nakum");
		s.setCourse("Spring");
		s.setFee(6000);
		studentRepo.save(s);
	}
	
	
	
					@Test
					void deleteoneStudent()
					{
						studentRepo.deleteById(8L);
					}
	

	
	@Test
	void getoneStudent()
	{
		Optional<Student> findById = studentRepo.findById(9L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	
	
	
					@Test
					void updateOneStudent() {
						Student s = new Student ();
						s.setId(1);
						s.setName("Nakum Akshay");
						s.setCourse("Spring");
						s.setFee(10000);
						studentRepo.save(s);
						}
}
	
	
	

	
	
	
	
	
	
	
	
	
	
