package com.example.jobportalapplication.controllers;

import com.example.jobportalapplication.entity.Employer;
import com.example.jobportalapplication.services.EmpService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
@RequestMapping("/Employer")
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/allEmployers")
    private List<Employer> allEmployer(){return empService.getAllEmployer();}

    @GetMapping("/findByid/{id}")
    private void employerById(@PathVariable Long id){empService.getById(id);}


    @PostMapping("/update")
    private ResponseEntity<Employer> employerUpdateById(@RequestBody Employer employer){
        return empService.update(employer);
    }
    @DeleteMapping("/delete")
    private ResponseEntity<Employer> employerDeleteById(@RequestBody Employer employer){
            return empService.delete(employer);

    }
    @PostMapping("/add")
    private  ResponseEntity<Employer> addEmployer(@RequestBody Employer employer){
        return empService.add(employer);
    }


    @PostMapping("/update1")
    private ResponseEntity<String> employerUpdate(@RequestBody Employer employer){
        return empService.update1(employer);
    }
    private void findUserById(){


    }
// list of users applied job for a particular job id
    private void getUserList(){


    }


}
