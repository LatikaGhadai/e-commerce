package com.hms.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.LaboratoryTest;
import com.hms.entity.Patient;

public interface LaboratoryTestRepository extends JpaRepository<LaboratoryTest, Integer> {
	
	List<LaboratoryTest> findByPatient(Patient patient);

    List<LaboratoryTest> findByTestDateBetween(Date startDate, Date endDate);

}
