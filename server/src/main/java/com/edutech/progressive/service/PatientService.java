package com.edutech.progressive.service;

import com.edutech.progressive.dto.PatientDTO;
import com.edutech.progressive.entity.Patient;

import java.util.List;

public interface PatientService {

    public List<Patient> getAllPatients();
    public Integer addPatient(Patient patient);
    public List<Patient> getAllPatientSortedByName();
    public void emptyArrayList();

}
