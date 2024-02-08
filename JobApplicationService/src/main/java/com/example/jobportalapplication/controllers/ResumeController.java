package com.example.jobportalapplication.controllers;

import com.example.jobportalapplication.entity.Resume;
import com.example.jobportalapplication.services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/resume")
@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/create")
    private Resume uploadResume(@RequestBody Resume resume){
        return resumeService.createResume(resume);
    }

    @GetMapping("/get-resume/{id}")
    private Resume getResume(@PathVariable Long id){
        return resumeService.fetchDataResume(id);
    }

    @GetMapping("/get-resume-all")
    private List<Resume> fetchAllData(){
        return resumeService.findAll();
    }

    @PutMapping("/update-resume/{id}")
    private Resume updateResume(@PathVariable Long id,
                                @RequestBody Resume resume){

        return resumeService.updateResume(resume,id);
    }

    @DeleteMapping("/remove-resume/{id}")
    private void deleteResumeById(@PathVariable Long id){
        resumeService.deleteResumeProfile(id);
    }
}
