package com.edutech.progressive.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private final Connection connection;

    public PatientDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int addPatient(Patient patient) {
        
        return -1;
    }

    @Override
    public Patient getPatientById(int patientId){

        return null;
    }

    @Override
    public void updatePatient(Patient patient) {
    
    }

    @Override
    public void deletePatient(int patientId) {
       
    }

    @Override
    public List<Patient> getAllPatients(){
        
        return null;
    }
}
