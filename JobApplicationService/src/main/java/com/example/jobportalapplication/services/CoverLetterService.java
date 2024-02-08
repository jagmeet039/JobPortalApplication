package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.CoverLetter;
import com.example.jobportalapplication.entity.Resume;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CoverLetterService{

    CoverLetter createCoverLetter(CoverLetter coverLetter);

    CoverLetter fetchDataCoverLetter(Long id);

    List<CoverLetter> findAll ();


    CoverLetter updateCoverLetter(CoverLetter coverLetter, Long id);


    void deleteCoverLetter(Long id);
}
