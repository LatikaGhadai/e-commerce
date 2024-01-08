package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	List<Patient> findByLastName(String lastName);
}
