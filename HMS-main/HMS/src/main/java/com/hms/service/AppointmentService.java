package com.hms.service;

import java.util.Date;
import java.util.List;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.entity.Patient;

public interface AppointmentService {

	List<Appointment> getAllAppointments();

	Appointment getAppointmentById(int appointmentId);

	List<Appointment> getAppointmentsByPatient(Patient patient);

	List<Appointment> getAppointmentsByDoctorAndDateRange(Doctor doctor, Date startDate, Date endDate);

}
