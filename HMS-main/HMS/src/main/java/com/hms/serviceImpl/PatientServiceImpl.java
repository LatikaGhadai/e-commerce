package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Patient;
import com.hms.repository.PatientRepository;
import com.hms.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
    private PatientRepository patientRepository;


	@Override
	public List<Patient> getAllPatients() {
		
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(int patientId) {
		return patientRepository.findById(patientId).orElse(null);
	}

	@Override
	public List<Patient> getPatientsByLastName(String lastName) {
		
		return patientRepository.findByLastName(lastName);
	}

}
