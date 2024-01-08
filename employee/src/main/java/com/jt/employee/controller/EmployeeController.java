package com.jt.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jt.employee.model.Employee;
import com.jt.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public String Create(@RequestBody Employee employee) {
		employeeService.saveEmp(employee);
		return "Save Successfully";
	}
	@PutMapping("/update{id}")
	public String update(@PathVariable String id , @RequestBody Employee employee) {
		employeeService.update(id, employee);
		return "Update Successfully";
	}
	@GetMapping("/getid/{empkId}")
	public Employee getBookById(@PathVariable String empId) {
		Employee empById = employeeService.getId(empId);
		return  empById;
	
}
