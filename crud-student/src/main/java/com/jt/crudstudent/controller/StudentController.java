package com.jt.crudstudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.crudstudent.model.Student;
import com.jt.crudstudent.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/save")
	public String create(@RequestBody Student student) {
		Student newStudent = studentService.create(student);
		return "User save";
	}
	
	@GetMapping("/getAll")
	public List<Student>getAlldata(){
		List<Student> all = studentService.getAll();
		return all;
	}
	
	
}
