package com.app.entity.modal;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "appointment_tbl")
public class Appointment extends BaseEntity {

	@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
	private LocalDateTime appointmentTime;

	private String appointmentType = "CLINIC_VISIT";

	private String chatDescription;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "doctor_id", nullable = false)
	@JsonIgnore
	private Doctor doctor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id", nullable = false)
	@JsonIgnore
	private Patient patient;

	public Appointment() {

	}

	public Appointment(LocalDateTime appointmentTime, Doctor doctor, Patient patient, String chatDescription) {
		super();
		this.appointmentTime = appointmentTime;
		this.doctor = doctor;
		this.patient = patient;
		this.chatDescription = chatDescription;
	}

	public LocalDateTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalDateTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getChatDescription() {
		return chatDescription;
	}

	public void setChatDescription(String chatDescription) {
		this.chatDescription = chatDescription;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentTime=" + appointmentTime + ", appointmentType=" + appointmentType +
				", chatDescription=" + chatDescription + "]";
	}

}
