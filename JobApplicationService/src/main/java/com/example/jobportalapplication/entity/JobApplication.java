package com.example.jobportalapplication.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jobApplicationId;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_user_id")
//    private User user;

    @JsonIgnore
    private boolean jobApplied;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_applicant_resume_id")
    private Resume resume;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_applicant_coverLetter_id")
    private CoverLetter coverLetter;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "job_posting_id", referencedColumnName = "jobPostingId")
//    private JobPosting jobPosting;


}
