package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
