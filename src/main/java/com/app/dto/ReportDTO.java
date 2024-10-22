package com.app.dto;

import java.util.Date;

public class ReportDTO {
    private Long doctorId;
    private Long patientId;
    private Long appointmentId;
    private String reportAbout;
    private Date reportDate;
    private String reportUrl;

    public ReportDTO() {
    }

    public ReportDTO(Long doctorId, Long patientId, Long appointmentId, String reportAbout, Date reportDate,
            String reportUrl) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentId = appointmentId;
        this.reportAbout = reportAbout;
        this.reportDate = reportDate;
        this.reportUrl = reportUrl;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getReportAbout() {
        return reportAbout;
    }

    public void setReportAbout(String reportAbout) {
        this.reportAbout = reportAbout;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

}
