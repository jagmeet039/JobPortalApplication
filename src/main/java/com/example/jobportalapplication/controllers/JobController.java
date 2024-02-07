package com.example.jobportalapplication.controllers;

import com.example.jobportalapplication.entity.JobPosting;
import com.example.jobportalapplication.services.JobService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobPosting")

public class JobController {
    @Autowired
    JobService jobService;


    @PostMapping("/add")
    public JobPosting addJob(@RequestBody JobPosting jobPosting){
        return jobService.addJob(jobPosting);

    }
    @PostMapping("/update")
    public Optional<JobPosting> updateJob(@RequestBody JobPosting jobPosting){
      return jobService.updateJob(jobPosting);
    }

    @GetMapping("/getAll")
    public List<JobPosting> getAllJobs(){
        return jobService.getAllJobs();
    }
    @GetMapping("/all/{id}")
    public Optional<JobPosting> getJobById(@PathVariable("id") Integer id){
        return jobService.getJobById(id);
    }
    @DeleteMapping("/delete/{id}")
    public Optional<JobPosting> deleteById(@PathVariable("id") Integer id){
        return jobService.deleteJob(id);
    }

}
