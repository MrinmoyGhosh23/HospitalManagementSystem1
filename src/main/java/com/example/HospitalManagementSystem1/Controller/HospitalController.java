package com.example.HospitalManagementSystem1.Controller;


import com.example.HospitalManagementSystem1.Service.DoctorService;
import com.example.HospitalManagementSystem1.dto.DoctorResponceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Public")
public class HospitalController {

    private  final DoctorService doctorService;

    @GetMapping("/doctor")
    public ResponseEntity<List<DoctorResponceDto>>getAllDoctor(){

        return ResponseEntity.ok(doctorService.getAllDocters());
    }

}
