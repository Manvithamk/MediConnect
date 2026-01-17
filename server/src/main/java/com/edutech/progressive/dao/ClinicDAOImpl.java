package com.edutech.progressive.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Clinic;

public class ClinicDAOImpl implements ClinicDAO {

    private final Connection connection;

    public ClinicDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Clinic getClinicById(int clinicId) {
        return null;
    }

    @Override
    public void deleteClinic(int clinicId) {
       
    }

    @Override
    public List<Clinic> getAllClinics() {
        
        return null;
    }

    @Override
    public int addClinic(Clinic clinic){
        
        return -1;
    }

    @Override
    public void updateClinic(Clinic clinic){

    }
}

