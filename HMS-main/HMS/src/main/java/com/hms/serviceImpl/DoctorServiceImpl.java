package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Doctor;
import com.hms.repository.DoctorRepository;
import com.hms.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
    private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> getAllDoctors() {
		
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(int doctorId) {
		
		return doctorRepository.findById(doctorId).orElse(null);
	}

	@Override
	public List<Doctor> getDoctorsBySpecialization(String specialization) {
		return doctorRepository.findBySpecialization(specialization);
	}

}
