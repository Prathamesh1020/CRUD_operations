package com.crudDemo.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudDemo.demo.entity.Student;

@RestController
@RequestMapping("/crud")
public class CrudController {
	
	Student st;
	@PostMapping
	public String addStudent(@RequestBody Student st) {
		this.st=st;
		return "Student added";
	}
	
	@GetMapping(value="{id}")
	public Student getStudent(String id) {
		return st;
	}
	
	@PutMapping
	public String uodateStudent(@RequestBody Student st) {
		this.st=st;
		return "Student added";
	}
	
	@DeleteMapping(value="{id}")
	public String deleteStudent(String id) {
		this.st=null;
		return "Student deleted";
	}
	

}
