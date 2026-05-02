package com.example.HospitalManagementSystem1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor

@ToString
public class BloodGroupCountResponseEntity {


    private  bloodGroupType BloodGroupType;


    private Long count;

}
