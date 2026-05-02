package com.example.HospitalManagementSystem1.Repository;

import com.example.HospitalManagementSystem1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}