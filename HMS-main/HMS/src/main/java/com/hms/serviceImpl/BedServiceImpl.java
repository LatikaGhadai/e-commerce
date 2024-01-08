package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Bed;
import com.hms.entity.Ward;
import com.hms.repository.BedRepository;
import com.hms.service.BedService;

@Service
public class BedServiceImpl implements BedService {

	@Autowired
	private BedRepository bedRepository;

	@Override
	public List<Bed> getAllBeds() {
		return bedRepository.findAll();
	}

	@Override
	public Bed getBedById(int bedId) {
		return bedRepository.findById(bedId).orElse(null);
	}

	@Override
	public List<Bed> getBedsByWard(Ward ward) {
		return bedRepository.findByWard(ward);
	}

	@Override
	public List<Bed> getUnoccupiedBeds() {
		return bedRepository.findByIsOccupied(false);
	}

}
