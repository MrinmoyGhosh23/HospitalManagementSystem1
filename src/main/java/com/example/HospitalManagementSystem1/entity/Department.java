package com.example.HospitalManagementSystem1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
        private Long id;


    @Column(nullable = false,unique = true,length=100)
    private String name;


    @OneToOne
    private Doctor HeadDoctor;

@ManyToMany
    @JoinTable (
    name="My_DPT_Doctors",
            joinColumns = @JoinColumn(name = "DPT_ID"),
    inverseJoinColumns = @JoinColumn(name = "Doctors_Id")
)
    private Set<Doctor> doctors = new HashSet<>() ;


}
