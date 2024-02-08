package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingRepository extends JpaRepository<JobPosting,Long> {
}
