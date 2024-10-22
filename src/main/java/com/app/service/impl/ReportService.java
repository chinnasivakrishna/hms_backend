package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.app.dto.ReportDTO;
import com.app.entity.modal.Appointment;
import com.app.entity.modal.Report;
import com.app.repository.ReportRepository;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public Report saveReport(Report report) {
        return reportRepository.save(report);
    }

    public List<Report> getReportsByAppointmentId(Long appointmentId) {
        return reportRepository.findByAppointmentId(appointmentId);
    }
}
