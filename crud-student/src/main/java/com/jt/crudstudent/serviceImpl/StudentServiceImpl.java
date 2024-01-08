package com.jt.crudstudent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.crudstudent.exception.ExceptionHandler;
import com.jt.crudstudent.model.Student;
import com.jt.crudstudent.model.studentRepo.StudentRepository;
import com.jt.crudstudent.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student create(Student student) {
		Student saveStudent = studentRepository.save(student);
		return saveStudent;
	}

	@Override
	public List<Student> getAll() {
		List<Student> allStud = studentRepository.findAll();
		return allStud;
	}

	@Override
	public Student getStudentById(int id) {
		Student stdbyId= studentRepository.findById(id).orElseThrow(()->new ExceptionHandler("Student Not Found"));
		return stdbyId; 
	}

	@Override
	public void deleteById(int id) {
		Student deleteId = studentRepository.findById(id).orElseThrow(()-> new ExceptionHandler("Student not found"));
		studentRepository.delete(deleteId);
	}

	@Override
	public Student update(int id, Student student) {
		studentRepository.
		return null;
	}
}
