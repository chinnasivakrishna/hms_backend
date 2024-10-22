package com.app.controller;

import com.app.entity.modal.Prescription;
import com.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prescriptions")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React frontend
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    // Save a new prescription
    @PostMapping
    public ResponseEntity<String> savePrescription(@RequestBody Prescription prescription) {
        // Set the current date
        prescription.setDate(LocalDate.now());

        // Save the prescription in the database
        prescriptionRepository.save(prescription);

        return ResponseEntity.ok("Prescription saved successfully!");
    }

    // Get prescriptions by patient ID
    @GetMapping("/byPatientId/{patientId}")
    public ResponseEntity<List<Prescription>> getPrescriptionsByPatientId(@PathVariable String patientId) {
        List<Prescription> prescriptions = prescriptionRepository.findByPatientId(patientId);
        if (prescriptions.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(prescriptions);
    }
}
