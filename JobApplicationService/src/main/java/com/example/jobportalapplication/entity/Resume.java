package com.example.jobportalapplication.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Table(name = "resume")
@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resumeId;

    private String title;

    private String contactInformation;

    private String education;

    private List<String> certification;

    private List<String> workHistory;

    public void setAll(String title, String contactInformation,
                         String education, List<String> certification,
                         List<String> workHistory) {
        this.title = title;
        this.contactInformation = contactInformation;
        this.education = education;
        this.certification = certification;
        this.workHistory = workHistory;

    }



    @OneToOne(mappedBy = "resume")
    private JobApplication jobApplication;
}
