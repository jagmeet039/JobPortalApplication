package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {
}
