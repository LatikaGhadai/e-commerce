package com.jt.crudstudent.service;

import java.util.List;

import com.jt.crudstudent.model.Student;

public interface StudentService {
	public Student create(Student student);
	public List<Student> getAll();
	public Student getStudentById(int id);
	public void deleteById(int id);
	public Student update(int id , Student student);
}
