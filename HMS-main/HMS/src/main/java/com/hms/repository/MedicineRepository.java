package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
	
	 List<Medicine> findByMedicineName(String medicineName);

}
