package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.Resume;
import com.example.jobportalapplication.repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ResumeServiceImpl implements ResumeService{
    @Autowired
    private ResumeRepository resumeRepository;

    private List<Resume> resumes=
            new ArrayList<>();

    public Resume createResume(Resume resume){
        return resumeRepository.save(resume);
    }

    @Override
    public Resume fetchDataResume(Long id) {
        Optional<Resume> findById = resumeRepository.findById(id);

        return findById.get();
//        return resumes.stream()
//                .filter(resume -> resume.getResumeId().equals(id))
//                .findFirst()
//                .orElseThrow();
    }

    @Override
    public List<Resume> findAll(){
        return resumeRepository.findAll();
    }

    @Override
    public Resume updateResume(Resume resume, Long id) {
        var originalResume = resumeRepository.findById(id).get();

        resume.setAll(resume.getTitle(), resume.getContactInformation(),
                resume.getEducation(), resume.getCertification(),
                resume.getWorkHistory());

        return resumeRepository.save(resume);
    }

    public void deleteResumeProfile(Long id){
        resumeRepository.deleteById(id);

    }

}
