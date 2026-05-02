package com.example.HospitalManagementSystem1.Service;

import com.example.HospitalManagementSystem1.Repository.InsuranceRepository;
import com.example.HospitalManagementSystem1.Repository.PatientRepository;
import com.example.HospitalManagementSystem1.entity.Insurance;
import com.example.HospitalManagementSystem1.entity.patient;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;



    @Transactional
    public patient assignInsuranceToPatient(Insurance insurance,Long patientId){



        //  By This Code  To Find The Patient
        patient Patient= patientRepository.findById(patientId)
                .orElseThrow(()-> new EntityNotFoundException("patient not found with id:" +patientId));

        Patient.setInsurance(insurance);//This Line Is The main code for this Program ......

        insurance.setPatient(Patient);//Bydiractional Consistancy Mentanence
         return  Patient;
    }

    public patient DisAssociateInsuranceForThePatient(Long PatientId){


        patient Patient= patientRepository.findById(PatientId)
                .orElseThrow(()-> new EntityNotFoundException("patient not found with id:" +PatientId));

Patient.setInsurance(null);
return  Patient;
    }


}
