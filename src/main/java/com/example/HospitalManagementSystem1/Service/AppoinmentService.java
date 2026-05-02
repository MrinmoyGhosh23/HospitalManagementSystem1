package com.example.HospitalManagementSystem1.Service;

import com.example.HospitalManagementSystem1.Repository.AppoinmentRepository;
import com.example.HospitalManagementSystem1.Repository.DoctorRepository;
import com.example.HospitalManagementSystem1.Repository.PatientRepository;
import com.example.HospitalManagementSystem1.dto.AppoinmentResponseDto;
import com.example.HospitalManagementSystem1.entity.Appoinment;
import com.example.HospitalManagementSystem1.entity.Doctor;
import com.example.HospitalManagementSystem1.entity.patient;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppoinmentService {

    private final AppoinmentRepository appoinmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public Appoinment createNewAppoinment(Appoinment appoinment, Long doctorId, Long patientId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        patient Patient = patientRepository.findById(patientId).orElseThrow();

        if (appoinment.getId() != null) throw new IllegalArgumentException("Appoinment Should not have any Id");

        appoinment.setPatient(Patient);
        appoinment.setDoctor(doctor);
        Patient.getAppoinments().add(appoinment);

        return appoinmentRepository.save(appoinment);
    }

    @Transactional
    public Appoinment ReAssignAppoinmentToAnnoterDoctor(Long appoinmentId, Long doctorId) {
        Appoinment appoinment = appoinmentRepository.findById(appoinmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appoinment.setDoctor(doctor);
        doctor.getAppoinments().add(appoinment);

        return appoinment;
    }

    public List<AppoinmentResponseDto> getAllAppointmentsOfDoctor(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        return doctor.getAppoinments().stream()
                .map(appointment -> modelMapper.map(appointment, AppoinmentResponseDto.class))
                .collect(Collectors.toList());
    }
}