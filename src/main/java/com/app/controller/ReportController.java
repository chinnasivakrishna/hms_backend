package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.app.dto.ReportDTO;
import com.app.entity.modal.Report;
import com.app.service.impl.ReportService;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/save")
    public ResponseEntity<Report> saveReport(@RequestBody ReportDTO reportDTO) {
        Report report = new Report();
        report.setDoctorId(reportDTO.getDoctorId());
        report.setPatientId(reportDTO.getPatientId());
        report.setAppointmentId(reportDTO.getAppointmentId());
        report.setReportAbout(reportDTO.getReportAbout());
        report.setReportDate(reportDTO.getReportDate());
        report.setReportUrl(reportDTO.getReportUrl());

        Report savedReport = reportService.saveReport(report);
        return ResponseEntity.ok(savedReport);
    }

    @GetMapping("/appointment/{appointmentId}")
    public ResponseEntity<List<Report>> getReportsByAppointmentId(@PathVariable Long appointmentId) {
        List<Report> reports = reportService.getReportsByAppointmentId(appointmentId);
        return ResponseEntity.ok(reports);
    }

}
