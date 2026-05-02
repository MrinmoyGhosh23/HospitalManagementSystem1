package com.example.HospitalManagementSystem1.Controller;

import com.example.HospitalManagementSystem1.Service.AppoinmentService;
import com.example.HospitalManagementSystem1.dto.AppoinmentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.HospitalManagementSystem1.entity.User;
import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final AppoinmentService appointmentService;

    @GetMapping("/appointments")
    public ResponseEntity<List<AppoinmentResponseDto>> getAllAppoinmentsOfDoctor() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(appointmentService.getAllAppointmentsOfDoctor(user.getId()));
    }

}