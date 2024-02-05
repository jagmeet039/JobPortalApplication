package com.example.jobportalapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employer {
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    private Long empId;
    private String companyName;
    private String province;
    private String country;
    private String contactNumber;
    private String email;
    private String userId;
    private String password;

}
