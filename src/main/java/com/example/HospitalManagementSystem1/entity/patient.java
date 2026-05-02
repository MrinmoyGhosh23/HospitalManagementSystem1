package com.example.HospitalManagementSystem1.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@Entity
@Setter
@Getter
@Table (
        name = "patient_tbl",
        uniqueConstraints  = {
                @UniqueConstraint(name = " unique_patient_email",columnNames = {"email"}),
                @UniqueConstraint(name = "Unique_patient_name_birthdate",columnNames = {"patient_name " ,"brithdate"})

        },
        indexes = {
                @Index(name = "idx_patient_name_birthdate ",columnList = "brithdate")
        }
)
public final class patient {


    @Id

   @GeneratedValue  (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_name",nullable = false,length = 40)

    private String name;
    private  String email;
    private LocalDateTime brithdate;
    private String gender;
    private String blood_group;



   // @Override
//    public String toString() {
//        return "patient{" +
//                "brithdate=" + brithdate +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
//    }

    @CreationTimestamp
@Column(updatable = false )
private LocalDateTime createdAt;



    @OneToOne(cascade = {CascadeType.ALL},orphanRemoval = true)
    @JoinColumn(name = "Patient_Insurance_Id")//Owning Side
    private Insurance insurance;

    @OneToMany(mappedBy = "Patient",cascade = {CascadeType.REMOVE},orphanRemoval = true)

    @ToString.Exclude
    private List<Appoinment> appoinments =new ArrayList<>();

}
