package com.example.HospitalManagementSystem1;

import com.example.HospitalManagementSystem1.Repository.PatientRepository;
import com.example.HospitalManagementSystem1.Service.PatientService;
import com.example.HospitalManagementSystem1.dto.BloodGroupCountResponseEntity;
import com.example.HospitalManagementSystem1.entity.patient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@SpringBootTest
public class patientTest {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;

    @Test

    public void testPatientRepository() {

        List<patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

        patient p1 = new patient();
        patientRepository.save(p1);



    }

        @Test
        public void  testTransactionMethods() {
            patient patient = patientService.getPatientById(1L);


            //patient Patient = patientRepository.findByName("Jasprit Arora");

//
//            List<patient>patientList=patientRepository.findByBloodGroup("O_POSITIVE") ;
//            for (patient Patient : patientList) {
//                System.out.println(Patient);

//
//                List<patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(2005, 05, 23));
//                for (patient Patient : patientList) {
//                    System.out.println(Patient);
//                }


            //Native Query Sentex
            Page<patient> patientList = patientRepository.findAllpatients(PageRequest.of(0, 2));

            for (patient Patient : patientList) {
                System.out.println(Patient);
            }

            // Change Or Update Name In A Table
//
//            int rowsupdate  = patientRepository.updateNameWithId("Ariel Roy",1L);
//
//            System.out.println(rowsupdate );







//
//            List<BloodGroupCountResponseEntity>bloodGroupList = patientRepository.countEachBloodGroupType();
//            for (BloodGroupCountResponseEntity bloodGroupCountResponse : bloodGroupList){
//                System.out.println(bloodGroupCountResponse);
            }
    }


