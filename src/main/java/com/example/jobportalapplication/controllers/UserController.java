package com.example.jobportalapplication.controllers;

import com.example.jobportalapplication.entity.UserEntity;
import com.example.jobportalapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String printTest(){
        return "Hi my name is Jagmeet";
    }

    @GetMapping("/all")
    public List<UserEntity> getAllEmp(){
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }

    @PutMapping("/update")
    public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity user) {
        UserEntity updatedUser = userService.updateUser(user);
        if (updatedUser != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Message", "User updated successfully");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(updatedUser);
        } else {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Error", "User not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(headers).body(null);
        }
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId) {
        boolean deleted = userService.deleteUser(userId);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.OK).body("User deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }

    @GetMapping("/{userId}")
    public UserEntity getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

}
