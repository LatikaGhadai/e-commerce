package com.hms.entity;

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
@Table(name = "bed")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bedId;
	
	@ManyToOne
	@JoinColumn(name = "ward_id")
	private Ward ward;
	
	private boolean isOccupied;

}
