package com.jt.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jt.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
	
}
