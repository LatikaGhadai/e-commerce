package com.hms.entity;

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
@Table(name="doctor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int doctorId;
	    private String firstName;
	    private String lastName;
	    private String specialization;
	    
	    @OneToMany(mappedBy = "doctor")
	    private List<Appointment> appointments;
}
