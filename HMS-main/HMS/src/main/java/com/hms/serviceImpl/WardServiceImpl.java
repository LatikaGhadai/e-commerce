package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Ward;
import com.hms.repository.WardRepository;
import com.hms.service.WardService;

@Service
public class WardServiceImpl implements WardService {

	@Autowired
	private WardRepository wardRepository;

	@Override
	public List<Ward> getAllWards() {
		return wardRepository.findAll();
	}

	@Override
	public Ward getWardById(int wardId) {
		return wardRepository.findById(wardId).orElse(null);
	}

	@Override
	public List<Ward> getWardsByName(String wardName) {
		return wardRepository.findByWardName(wardName);
	}

}
