package com.example.HospitalManagementSystem1.Repository;

import com.example.HospitalManagementSystem1.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}