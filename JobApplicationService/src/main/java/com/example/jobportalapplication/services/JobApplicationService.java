package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.JobApplication;
import com.example.jobportalapplication.exception.JobApplicationException;

import java.util.List;
import java.util.Optional;

public interface JobApplicationService {
    JobApplication createJobApplication(JobApplication jobApplication) throws JobApplicationException;

    void deleteJobApplication(Long id);

    List<JobApplication> fetchAllApplications();

    JobApplication fetchApplicationsByID(Long id);
}
