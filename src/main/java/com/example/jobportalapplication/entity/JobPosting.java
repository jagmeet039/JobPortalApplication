package com.example.jobportalapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobId;
    private Integer employerId;
    private String jobTitle;
    private String jobDescription;
    private String companyInfo;
    private long contactInfo;
    private String jobClosingDate;
    private Integer salary;
    private String workSchedule;


}
