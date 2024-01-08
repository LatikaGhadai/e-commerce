package com.hms.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "billing")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billingId;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	private Date billingDate;
	private double totalAmount;

}
