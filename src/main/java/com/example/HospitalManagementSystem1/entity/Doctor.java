package com.example.HospitalManagementSystem1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false,length=100)
    private String Specialist;

    @Column(nullable = false,unique = true,length=100)
    private String email;

    //By Directtional table
@ManyToMany(mappedBy = "doctors")
@ToString.Exclude
private Set<Department>departments=new HashSet<>();

@OneToMany(mappedBy = "doctor")
@ToString.Exclude
    private List<Appoinment> appoinments =new ArrayList<>();


}
