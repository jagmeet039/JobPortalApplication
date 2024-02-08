package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.CoverLetter;
import com.example.jobportalapplication.repositories.CoverLetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoverLetterServiceImpl implements CoverLetterService {

    @Autowired
    private CoverLetterRepository coverLetterRepository;

    @Override
    public CoverLetter createCoverLetter(CoverLetter coverLetter) {
        return coverLetterRepository.save(coverLetter);
    }

    @Override
    public CoverLetter fetchDataCoverLetter(Long id) {
        Optional<CoverLetter> findById = coverLetterRepository.findById(id);

        return findById.get();
//        return resumes.stream()
//                .filter(resume -> resume.getResumeId().equals(id))
//                .findFirst()
//                .orElseThrow();
    }

    @Override
    public List<CoverLetter> findAll() {
        return coverLetterRepository.findAll();
    }

    @Override
    public CoverLetter updateCoverLetter(CoverLetter coverLetter, Long id) {
        var originalResume = coverLetterRepository.findById(id).get();

        coverLetter.setAll(coverLetter.getTitle(), coverLetter.getContactInformation(),
                coverLetter.getDate(), coverLetter.getCompanyInformation(),
                coverLetter.getCoverLetterParagraph(), coverLetter.getSignOff());

        return coverLetterRepository.save(coverLetter);
    }

    @Override
    public void deleteCoverLetter(Long id) {
        coverLetterRepository.deleteById(id);
    }
}
