package com.app.dto;

import com.app.entity.modal.Patient;

public class AppointmentDetailsDTO {
    private Patient patient;
    private String message;

    public AppointmentDetailsDTO(Patient patient, String message) {
        this.patient = patient;
        this.message = message;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
