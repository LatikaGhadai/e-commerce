package com.jt.crudstudent.model.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jt.crudstudent.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
