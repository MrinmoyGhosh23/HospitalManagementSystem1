package com.example.HospitalManagementSystem1.Repository;

import com.example.HospitalManagementSystem1.dto.BloodGroupCountResponseEntity;
import com.example.HospitalManagementSystem1.entity.patient;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository <patient,Long> {

//   patient findAllByName(String patient_name);
//
//
//    patient findByName(String  name);


//
//    @Query("SELECT p from patient p where p.blood_group =?1")
//    List<patient>findByBloodGroup(@Param("bloodgroup") String blood_group);

//
//    @Query("SELECT p from patient p where p. brithdate=brithdate")
//    List<patient>findByBornAfterDate(@Param("BrithDate") LocalDate BrithDate);


 //Native Query Sentex
    @Query(value = "SELECT *FROM patient_tbl  ",nativeQuery = true)
        Page<patient>findAllpatients(Pageable pageable);


 // Change Or Update Name In A Table
//@Transactional
// @Modifying
// @Query("UPDATE patient p set p.name= :name where p.id =:id")
// int updateNameWithId(@Param("name")String name ,@Param("id")Long id);
//
//    int updateNameWithId(String name);

// @Query("SELECT new com.example.HospitalManagementSystem1.dto.BloodGroupCountResponseEntity(p.bloodgroup,   " +
//         " COUNT(p)) FROM patient p GROUP BY p.blood_group")
// List<BloodGroupCountResponseEntity> countEachBloodGroupType();


}