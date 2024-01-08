package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
	List<Doctor> findBySpecialization(String specialization);


}
