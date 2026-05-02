package com.example.HospitalManagementSystem1;


import com.example.HospitalManagementSystem1.Service.AppoinmentService;
import com.example.HospitalManagementSystem1.Service.InsuranceService;
import com.example.HospitalManagementSystem1.entity.Appoinment;
import com.example.HospitalManagementSystem1.entity.Insurance;
import com.example.HospitalManagementSystem1.entity.patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {


    @Autowired
    private InsuranceService insuranceService;


    @Test
public void testInsurance(){


        Insurance insurance =  Insurance.builder()
                .policyNumber("HDFC_1234")
                .provider("HDFC")
                .volidUnit(LocalDate.of(2030,12,6))
                .build();


        patient Patient = insuranceService.assignInsuranceToPatient(insurance,1L);
    System.out.println(Patient);


   var NewPatient= insuranceService.DisAssociateInsuranceForThePatient(Patient.getId());

    }


    @Autowired
    private AppoinmentService appoinmentService;


    @Test
    public  void tastCreateAppoinment(){
        Appoinment appoinment= Appoinment.builder()
                .appoinmenttime(LocalDateTime.of(2025,6,1,14,24,23))
                .reason("blood")

                .build();


      var newappoinment=  appoinmentService.createNewAppoinment(appoinment,1L,2L);

        System.out.println(newappoinment);


        // This code for Re Assign Appoinment


        var updatedappoinment = appoinmentService.ReAssignAppoinmentToAnnoterDoctor(newappoinment.getId(), 3L);
        System.out.println(updatedappoinment);



    }

}
