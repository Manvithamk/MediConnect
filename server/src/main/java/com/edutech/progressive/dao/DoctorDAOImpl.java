package com.edutech.progressive.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Doctor;

public class DoctorDAOImpl implements DoctorDAO {
    private final Connection connection;

    public DoctorDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        
        return null;
    }

    @Override
    public void deleteDoctor(int doctorId){
       
    }

    @Override
    public List<Doctor> getAllDoctors() {
        
        return null;
    }

    @Override
    public int addDoctor(Doctor doctor){
        
        return -1;
    }

    @Override
    public void updateDoctor(Doctor doctor) {
    }
}

