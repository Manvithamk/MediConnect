package com.edutech.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.progressive.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

    List<Patient> findAllOrderByNameAsc();
}
