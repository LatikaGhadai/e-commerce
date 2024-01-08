package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.LaboratoryTest;
import com.hms.service.LaboratoryTestService;

@RestController
@RequestMapping("/laboratoryTests")
public class LaboratoryTestController {

	@Autowired
	private LaboratoryTestService laboratoryTestService;

	@GetMapping
	public List<LaboratoryTest> getAllLaboratoryTests() {
		return laboratoryTestService.getAllLaboratoryTests();
	}

	@GetMapping("/{id}")
	public LaboratoryTest getLaboratoryTestById(@PathVariable int id) {
		return laboratoryTestService.getLaboratoryTestById(id);
	}

}
