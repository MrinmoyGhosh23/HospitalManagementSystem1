package com.example.HospitalManagementSystem1.Repository;

import com.example.HospitalManagementSystem1.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}