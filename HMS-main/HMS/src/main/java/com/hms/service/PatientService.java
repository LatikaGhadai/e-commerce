package com.hms.service;

import java.util.List;

import com.hms.entity.Patient;

public interface PatientService {

	List<Patient> getAllPatients();

	Patient getPatientById(int patientId);

	List<Patient> getPatientsByLastName(String lastName);

}
