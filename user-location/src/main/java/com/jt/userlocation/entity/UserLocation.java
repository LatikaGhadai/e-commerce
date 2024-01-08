package com.jt.userlocation.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_location")
public class UserLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double latitude;
	private double longitude;
	private boolean excluded;
}
