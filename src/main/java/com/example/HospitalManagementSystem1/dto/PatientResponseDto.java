package com.example.HospitalManagementSystem1.dto;

//import com.codingshuttle.youtube.hospitalManagement.entity.type.BloodGroupType;
import com.example.HospitalManagementSystem1.entity.BloodGroupType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientResponseDto {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private BloodGroupType bloodGroup;
}