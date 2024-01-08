package com.hms.service;

import java.util.List;

import com.hms.entity.HealthRecord;

public interface HealthRecordService {
	
	List<HealthRecord> getAllHealthRecords();

    HealthRecord getHealthRecordById(int recordId);

    List<HealthRecord> getHealthRecordsByDiagnosis(String diagnosis);
    

}
