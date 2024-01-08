package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.HealthRecord;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Integer>{
	
	List<HealthRecord> findByDiagnosis(String diagnosis);

}
