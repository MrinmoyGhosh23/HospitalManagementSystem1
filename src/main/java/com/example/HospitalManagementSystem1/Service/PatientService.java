package com.example.HospitalManagementSystem1.Service;


import com.example.HospitalManagementSystem1.Repository.PatientRepository;
import com.example.HospitalManagementSystem1.dto.PatientResponseDto;
import com.example.HospitalManagementSystem1.entity.patient;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
@Transactional
    public  patient getPatientById(Long id) {
        patient p1= patientRepository.findById(id).orElseThrow();

       patient p2 =patientRepository.findById(id).orElseThrow();



       p1.setName("ggggg");

         return p1;
    }


    public @Nullable List<PatientResponseDto> getAllPatients(Integer pageNumber, Integer pageSize) {
    return   List.of();
    }
}

