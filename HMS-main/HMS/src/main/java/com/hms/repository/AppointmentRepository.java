package com.hms.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.entity.Patient;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	List<Appointment> findByPatient(Patient patient);

	List<Appointment> findByDoctorAndAppointmentDateBetween(Doctor doctor, Date startDate, Date endDate);
}
