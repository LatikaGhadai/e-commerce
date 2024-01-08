package com.jt.employee.service;



import com.jt.employee.model.Employee;

public interface EmployeeService {
	public Employee saveEmp(Employee employee);
	public Employee update(String id, Employee employee);
	public Employee getId(String id);
}
