package com.hms.service;

import java.util.List;

import com.hms.entity.Doctor;

public interface DoctorService {

	List<Doctor> getAllDoctors();

	Doctor getDoctorById(int doctorId);

	List<Doctor> getDoctorsBySpecialization(String specialization);

}
