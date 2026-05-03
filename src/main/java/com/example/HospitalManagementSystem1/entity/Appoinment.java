package com.example.HospitalManagementSystem1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Appoinment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column(nullable = false)
    private LocalDateTime appoinment_time;


    @Column(length = 500)
    private  String reason;


@ManyToOne
@JoinColumn(name = "patient_id") //patient are  requerd
    private  patient Patient;


@ManyToOne
@JoinColumn
    private Doctor doctor;




}
