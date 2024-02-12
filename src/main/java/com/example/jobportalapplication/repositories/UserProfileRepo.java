package com.example.jobportalapplication.repositories;

import com.example.jobportalapplication.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepo extends JpaRepository<UserProfile, Integer> {

}
