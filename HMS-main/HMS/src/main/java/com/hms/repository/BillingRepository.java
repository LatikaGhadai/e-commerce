package com.hms.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Billing;
import com.hms.entity.Patient;

public interface BillingRepository extends JpaRepository<Billing, Integer> {

	List<Billing> findByPatient(Patient patient);

	List<Billing> findByBillingDateBetween(Date startDate, Date endDate);

}
