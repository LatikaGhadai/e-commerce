package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Billing;
import com.hms.entity.Patient;
import com.hms.repository.BillingRepository;
import com.hms.service.BillingService;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepository;

	@Override
	public List<Billing> getAllBillings() {
		return billingRepository.findAll();
	}

	@Override
	public Billing getBillingById(int billingId) {
		return billingRepository.findById(billingId).orElse(null);
	}

	@Override
	public List<Billing> getBillingsByPatient(Patient patient) {
		return billingRepository.findByPatient(patient);
	}

}
