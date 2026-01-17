package com.edutech.progressive.service;

import com.edutech.progressive.dto.DoctorDTO;
import com.edutech.progressive.entity.Doctor;

import java.util.List;

public interface DoctorService {

    public List<Doctor> getAllDoctors();
    public Integer addDoctor(Doctor doctor);
    public List<Doctor> getDoctorSortedByExperience();
    public void emptyArrayList();

}
