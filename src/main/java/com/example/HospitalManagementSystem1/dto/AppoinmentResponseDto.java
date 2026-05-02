package com.example.HospitalManagementSystem1.dto;

import com.example.HospitalManagementSystem1.dto.DoctorResponseDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppoinmentResponseDto {
    private Long id;
    private LocalDateTime appointmentTime;
    private String reason;
    private DoctorResponseDto doctor;
//    private PatientResponseDto patient;
}