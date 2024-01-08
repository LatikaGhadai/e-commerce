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
@Table(name = "laboratory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaboratoryTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testId;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	private Date testDate;
	private String testName;

}
