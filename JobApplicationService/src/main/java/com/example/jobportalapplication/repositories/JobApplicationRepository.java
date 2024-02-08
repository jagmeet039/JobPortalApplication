package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication,Long> {
}
