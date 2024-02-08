package com.example.jobportalapplication.controllers;

import com.example.jobportalapplication.entity.JobApplication;
import com.example.jobportalapplication.exception.JobApplicationException;
import com.example.jobportalapplication.services.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/job-application")
public class JobApplicationController {

    private JobApplicationService jobApplicationService;

    @PostMapping("/apply")
    public JobApplication apply(@RequestBody JobApplication jobApplication) throws JobApplicationException {
        return jobApplicationService.createJobApplication(jobApplication);
    }

    @GetMapping("/all-applications")
    public List<JobApplication> fetchAllApplications(){
        return jobApplicationService.fetchAllApplications();
    }

    @GetMapping("/application/{id}")
    public JobApplication fetchApplicationById(@PathVariable Long id){
        return jobApplicationService.fetchApplicationsByID(id);
    }

    @DeleteMapping("/remove-application/{id}")
    public void removeApplication(@PathVariable Long id){
        jobApplicationService.deleteJobApplication(id);
    }
}
