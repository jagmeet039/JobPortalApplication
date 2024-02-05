package com.example.jobportalapplication.services;

import com.example.jobportalapplication.entity.Employer;
import com.example.jobportalapplication.repositories.EmpRepo;
import feign.Response;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class EmpService {
    private final EmpRepo empRepo;
   // @Autowired
  //  public HttpHeaders httpHeader;

    public List<Employer> getAllEmployer(){return empRepo.findAll();}

    public Optional<Employer> getById(Long id){
        Optional<Employer> response = empRepo.findById(id);
        return response;
    }

    public ResponseEntity<Employer> update(Employer employer){
       // ResponseEntity response
        if((empRepo.findById(employer.getEmpId()).isPresent())){
            empRepo.save(employer);
            return  ResponseEntity.ok().body(employer);}

            else return ResponseEntity.badRequest().build();
        }

        public ResponseEntity<Employer> delete(Employer employer){

        if(empRepo.findById((employer.getEmpId())).isPresent()){
            empRepo.delete(employer);
            return ResponseEntity.ok().body(employer);
        }else  return  ResponseEntity.badRequest().build();
        }
        public ResponseEntity<Employer> add(Employer employer){

        empRepo.save(employer);
        return ResponseEntity.ok().body(employer);
        }

    public ResponseEntity<String> update1(Employer employer){
        // ResponseEntity response
        if((empRepo.findById(employer.getEmpId()).isPresent())){
            empRepo.save(employer);
            return  ResponseEntity.ok().body("Updated successfully");}

        else return ResponseEntity.badRequest().body("Failed to Update");
    }

    }

