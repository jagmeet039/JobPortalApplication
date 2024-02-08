package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.CoverLetter;
import com.example.jobportalapplication.entity.JobApplication;
import com.example.jobportalapplication.exception.JobApplicationException;
import com.example.jobportalapplication.repositories.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JobApplicationServiceImpl implements JobApplicationService{


    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    public JobApplication createJobApplication(JobApplication jobApplication) throws JobApplicationException {
        if(jobApplication.getResume()!=null||jobApplication.getCoverLetter()!=null) {
            System.out.println("Job application has been submitted");
            return jobApplicationRepository.save(jobApplication);
        }else
           throw new JobApplicationException();
    }

    @Override
    public void deleteJobApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }

    @Override
    public List<JobApplication> fetchAllApplications() {
        return jobApplicationRepository.findAll();
    }

    @Override
    public JobApplication fetchApplicationsByID(Long id) {
        Optional<JobApplication> findById = jobApplicationRepository.findById(id);

        return findById.get();
    }
}
