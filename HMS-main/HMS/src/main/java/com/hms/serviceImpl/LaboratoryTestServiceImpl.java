package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.LaboratoryTest;
import com.hms.entity.Patient;
import com.hms.repository.LaboratoryTestRepository;
import com.hms.service.LaboratoryTestService;

@Service
public class LaboratoryTestServiceImpl implements LaboratoryTestService {

	@Autowired
	private LaboratoryTestRepository laboratoryTestRepository;

	@Override
	public List<LaboratoryTest> getAllLaboratoryTests() {
		return laboratoryTestRepository.findAll();
	}

	@Override
	public LaboratoryTest getLaboratoryTestById(int testId) {
		return laboratoryTestRepository.findById(testId).orElse(null);
	}

	@Override
	public List<LaboratoryTest> getLaboratoryTestsByPatient(Patient patient) {
		return laboratoryTestRepository.findByPatient(patient);
	}

}
