package com.example.jobportalapplication.controllers;

import com.example.jobportalapplication.entity.CoverLetter;
import com.example.jobportalapplication.entity.Resume;
import com.example.jobportalapplication.services.CoverLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoverLetterController {
    @Autowired
    private CoverLetterService coverLetterService;

    @PostMapping("/create")
    private CoverLetter uploadCoverLetter(@RequestBody CoverLetter coverLetter){
        return coverLetterService.createCoverLetter(coverLetter);
    }

    @GetMapping("/get-cover-letter/{id}")
    private CoverLetter getCoverLetter(@PathVariable Long id){
        return coverLetterService.fetchDataCoverLetter(id);
    }

    @GetMapping("/get-cover-letter-all")
    private List<CoverLetter> fetchAllData(){
        return coverLetterService.findAll();
    }

    @PutMapping("/update-cover-letter/{id}")
    private CoverLetter updateCoverLetter(@PathVariable Long id,
                                @RequestBody CoverLetter coverletter){

        return coverLetterService.updateCoverLetter(coverletter,id);
    }

    @DeleteMapping("/remove-cover-letter/{id}")
    private void deleteCoverLetterById(@PathVariable Long id){

        coverLetterService.deleteCoverLetter(id);
    }

}
