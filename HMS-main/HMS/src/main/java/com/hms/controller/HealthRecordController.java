package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.HealthRecord;
import com.hms.service.HealthRecordService;

@RestController
@RequestMapping("/healthRecords")
public class HealthRecordController {
	
	@Autowired
    private HealthRecordService healthRecordService;

    @GetMapping
    public List<HealthRecord> getAllHealthRecords() {
        return healthRecordService.getAllHealthRecords();
    }

    @GetMapping("/{id}")
    public HealthRecord getHealthRecordById(@PathVariable int id) {
        return healthRecordService.getHealthRecordById(id);
    }

}
