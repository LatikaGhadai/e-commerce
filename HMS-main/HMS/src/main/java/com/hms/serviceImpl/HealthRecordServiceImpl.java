package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.HealthRecord;
import com.hms.repository.HealthRecordRepository;
import com.hms.service.HealthRecordService;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

	@Autowired
	private HealthRecordRepository healthRecordRepository;

	@Override
	public List<HealthRecord> getAllHealthRecords() {
		return healthRecordRepository.findAll();
	}

	@Override
	public HealthRecord getHealthRecordById(int recordId) {
		return healthRecordRepository.findById(recordId).orElse(null);
	}

	@Override
	public List<HealthRecord> getHealthRecordsByDiagnosis(String diagnosis) {
		return healthRecordRepository.findByDiagnosis(diagnosis);
	}

}
