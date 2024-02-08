package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.Resume;

import java.util.List;

public interface ResumeService {

    Resume createResume(Resume resume);

    Resume fetchDataResume (Long id);

   List<Resume> findAll ();

   Resume updateResume(Resume resume, Long id);

    void deleteResumeProfile(Long id);
}
