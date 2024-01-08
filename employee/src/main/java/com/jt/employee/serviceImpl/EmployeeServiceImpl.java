package com.jt.employee.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jt.employee.exception.ExceptionHandler;
import com.jt.employee.model.Employee;
import com.jt.employee.repo.EmployeeRepo;
import com.jt.employee.service.EmployeeService;
@Service
public class EmployeeServiceImpl  implements  EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmp(Employee employee) {
		Employee saveE = employeeRepo.save(employee);
		return saveE;
	}

	@Override
	public Employee update(String id, Employee employee) {
		Employee empid = employeeRepo.findById(id).orElseThrow(() -> new ExceptionHandler("Id not found"));
		empid.setName(employee.getName());
		empid.setAddress(employee.getAddress());
		Employee up = employeeRepo.save(employee);
		return up;
	}

	@Override
	public Employee getId(String id) {
		
	Employee empid = employeeRepo.findById(id).orElseThrow(() -> new ExceptionHandler("Employee Not Found"));
		
		return empid;
	}

}
