package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPosting, Integer> {

}
