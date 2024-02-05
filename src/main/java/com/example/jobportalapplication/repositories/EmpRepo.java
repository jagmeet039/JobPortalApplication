package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employer,Long> {
}
