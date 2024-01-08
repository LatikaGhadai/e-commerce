package com.hms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ward")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ward {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int wardId;
	 private String wardName;

}
