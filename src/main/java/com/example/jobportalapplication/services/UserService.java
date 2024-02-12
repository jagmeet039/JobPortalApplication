package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.UserEntity;
import com.example.jobportalapplication.repositories.UserProfileRepo;
import com.example.jobportalapplication.repositories.UserRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class UserService {
    private final UserRepo userRepository;
    private final UserProfileRepo userProfileRepo;
    public UserEntity addUser(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public UserEntity updateUser(UserEntity user) {
        Optional<UserEntity> existingUser = userRepository.findById(user.getUserId());
        if (existingUser.isPresent()) {
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public boolean deleteUser(Integer userId) {
        Optional<UserEntity> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            userRepository.deleteById(userId);
            return true;
        } else {
            return false;
        }
    }

    public UserEntity getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

}
