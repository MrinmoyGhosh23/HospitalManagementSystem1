package com.example.HospitalManagementSystem1.entity;


import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 50)
    private String policyNumber;




    @Column(nullable = false,length = 100)
    private String provider;

    @Column(nullable = false)
    private LocalDate volidUnit;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;


    @Enumerated(EnumType.STRING)
    public BloodGroupType bloodGroupType;


@OneToOne(mappedBy = "insurance")//inverse Side
private patient Patient;





}
