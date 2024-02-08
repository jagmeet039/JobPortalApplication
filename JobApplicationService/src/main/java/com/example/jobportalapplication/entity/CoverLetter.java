package com.example.jobportalapplication.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "cover_letter")
@NoArgsConstructor
@Data
@Entity
public class CoverLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long coverLetterId;
    private String contactInformation;
    private String title;
    private String date;
    private String companyInformation;
    private String coverLetterParagraph;
    private String signOff;
    @OneToOne(mappedBy = "resume")
    private JobApplication jobApplication;

    public void setAll(String title, String contactInformation,
                       String date, String companyInformation,
                       String coverLetterParagraph, String signOff) {
        this.title = title;
        this.contactInformation = contactInformation;
        this.date = date;
        this.companyInformation = companyInformation;
        this.coverLetterParagraph = coverLetterParagraph;
        this.signOff = signOff;


    }
}
