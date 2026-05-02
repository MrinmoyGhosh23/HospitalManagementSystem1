package com.example.HospitalManagementSystem1.Controller;

//import com.codingshuttle.youtube.hospitalManagement.dto.DoctorResponseDto;
//import com.codingshuttle.youtube.hospitalManagement.dto.OnboardDoctorRequestDto;
//import com.codingshuttle.youtube.hospitalManagement.dto.PatientResponseDto;
//import com.codingshuttle.youtube.hospitalManagement.service.DoctorService;
//import com.codingshuttle.youtube.hospitalManagement.service.PatientService;
import com.example.HospitalManagementSystem1.Service.DoctorService;
import com.example.HospitalManagementSystem1.Service.PatientService;
import com.example.HospitalManagementSystem1.dto.DoctorResponseDto;
import com.example.HospitalManagementSystem1.dto.OnboardDoctorRequestDto;
import com.example.HospitalManagementSystem1.dto.PatientResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final PatientService patientService;
    private final DoctorService doctorService;

    @GetMapping("/patients")
    public ResponseEntity<List<com.example.HospitalManagementSystem1.dto.PatientResponseDto>> getAllPatients(
            @RequestParam(value = "page", defaultValue = "0") Integer pageNumber,
            @RequestParam(value = "size", defaultValue = "10") Integer pageSize
    ) {
        return ResponseEntity.ok(patientService.getAllPatients(pageNumber, pageSize));
    }

    @PostMapping("/onBoardNewDoctor")
    public ResponseEntity<DoctorResponseDto> onBoardNewDoctor(@RequestBody OnboardDoctorRequestDto onboardDoctorRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(doctorService.onBoardNewDoctor(onboardDoctorRequestDto));
    }
}