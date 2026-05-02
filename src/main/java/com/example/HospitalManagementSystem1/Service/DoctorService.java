package com.example.HospitalManagementSystem1.Service;

import com.example.HospitalManagementSystem1.Repository.DoctorRepository;
import com.example.HospitalManagementSystem1.dto.DoctorResponceDto;
import com.example.HospitalManagementSystem1.dto.DoctorResponseDto;
import com.example.HospitalManagementSystem1.dto.OnboardDoctorRequestDto;
import com.example.HospitalManagementSystem1.entity.Doctor;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // 1. Save New Doctor Data

    public Doctor saveDoctor(Doctor doctor) {

        return doctorRepository.save(doctor);
    }

    // 2. Doctor List

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // 3.Finding Doctor Through ID

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
    }

    // 4. Update Doctor Information

    public Doctor updateDoctor(Long id, Doctor doctorDetails) {
        Doctor existingDoctor = getDoctorById(id);
        existingDoctor.setName(doctorDetails.getName());
        existingDoctor.setSpecialist(doctorDetails.getSpecialist());

        existingDoctor.setEmail(doctorDetails.getEmail());

        return doctorRepository.save(existingDoctor);
    }

    // 5.Delete Doctor

    public void deleteDoctor(Long id) {
        Doctor doctor = getDoctorById(id);
        doctorRepository.delete(doctor);
    }

    public  List<DoctorResponceDto> getAllDocters() {

        return List.of();
    }

    public  DoctorResponseDto onBoardNewDoctor(OnboardDoctorRequestDto onboardDoctorRequestDto) {
        return new DoctorResponseDto();
    }
}


