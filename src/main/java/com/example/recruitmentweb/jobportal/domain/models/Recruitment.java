package com.example.recruitmentweb.jobportal.domain.models;

import com.example.recruitmentweb.jobportal.domain.models.audit.DateAudit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "tbl_recruitment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recruitment extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "jobseeker_id")
    private Jobseeker jobseeker;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "is_answer")
    private Boolean isAnswer;

    @Column(name = "cv")
    private String cv;

    public Recruitment(Job job, User user) {
        super();
        this.jobseeker = user.getJobseeker();
        this.job = job;
    }
}
