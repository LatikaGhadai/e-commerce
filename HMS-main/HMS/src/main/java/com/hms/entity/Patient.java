package com.hms.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int patientId;
	    private String firstName;
	    private String lastName;
	    private String gender;
	    private Date dateOfBirth;
	    
	    @OneToMany(mappedBy = "patient")
	    private List<Appointment> appointments;

	    @OneToMany(mappedBy = "patient")
	    private List<Billing> billings;

	    @OneToMany(mappedBy = "patient")
	    private List<HealthRecord> healthRecords;

	    @OneToMany(mappedBy = "patient")
	    private List<LaboratoryTest> laboratoryTests;

}
