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
@Table(name = "healthRecord")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HealthRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recordId;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	private Date recordDate;
	private String diagnosis;

}
