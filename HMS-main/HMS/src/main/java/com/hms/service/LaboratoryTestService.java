package com.hms.service;

import java.util.List;

import com.hms.entity.LaboratoryTest;
import com.hms.entity.Patient;

public interface LaboratoryTestService {

	List<LaboratoryTest> getAllLaboratoryTests();

	LaboratoryTest getLaboratoryTestById(int testId);

	List<LaboratoryTest> getLaboratoryTestsByPatient(Patient patient);

}
