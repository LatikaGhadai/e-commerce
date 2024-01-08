package com.hms.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.entity.Patient;
import com.hms.repository.AppointmentRepository;
import com.hms.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public List<Appointment> getAllAppointments() {
		
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment getAppointmentById(int appointmentId) {
		
		return appointmentRepository.findById(appointmentId).orElse(null);
	}

	@Override
	public List<Appointment> getAppointmentsByPatient(Patient patient) {
		return appointmentRepository.findByPatient(patient);
	}

	@Override
	public List<Appointment> getAppointmentsByDoctorAndDateRange(Doctor doctor, Date startDate, Date endDate) {
		return appointmentRepository.findByDoctorAndAppointmentDateBetween(doctor, startDate, endDate);
	}

}
