package com.hms.service;

import java.util.List;

import com.hms.entity.Billing;
import com.hms.entity.Patient;

public interface BillingService {

	List<Billing> getAllBillings();

	Billing getBillingById(int billingId);

	List<Billing> getBillingsByPatient(Patient patient);

}
