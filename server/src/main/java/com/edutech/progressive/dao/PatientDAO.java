package com.edutech.progressive.dao;

import com.edutech.progressive.entity.Patient;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient);
    Patient getPatientById(int patientId);
    void updatePatient (Patient patient) ;
    void deletePatient (int patientId);
    List<Patient> getAllPatients();
}