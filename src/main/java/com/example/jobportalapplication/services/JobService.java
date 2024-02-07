package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.JobPosting;
import com.example.jobportalapplication.repositories.JobRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class JobService {

    private final JobRepo jobRepo;

    public JobPosting addJob(JobPosting jobPosting){ // add job
        return jobRepo.save(jobPosting);
    }
    public Optional<JobPosting> getJobById(Integer id){ // get Job By Id
        return jobRepo.findById(id);
    }
    public Optional<JobPosting> updateJob(JobPosting jobPosting){ // Update Job
        Optional<JobPosting> getJobById = getJobById(jobPosting.getJobId());
        if (getJobById.isPresent()){
            return Optional.of(addJob(jobPosting));
        }
        return Optional.empty();
    }
    public List<JobPosting> getAllJobs(){  // Get All Jobs
        return jobRepo.findAll();
    }
    public Optional<JobPosting> deleteJob(Integer id){
        Optional<JobPosting> jobPostingId = getJobById(id);
        if (jobPostingId.isPresent()){
             jobRepo.deleteById(id);
             return jobPostingId;
        }
        return Optional.empty();
    }
}
