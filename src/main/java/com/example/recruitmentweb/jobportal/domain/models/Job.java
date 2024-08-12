package com.example.recruitmentweb.jobportal.domain.models;

import com.example.recruitmentweb.jobportal.domain.enums.JobStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Job entity
 */

@Entity
@Table(name = "tbl_job")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "job_title")
    private String jobTitle;
    private String level;

    @Column(name = "types_of_cv")
    private String typesOfCV;
    private String address;
    @Column(name = "min_salary")
    private BigDecimal minSalary;
    @Column(name = "max_salary")
    private BigDecimal maxSalary;
    @Lob
    private String description;

    @Column(name = "require_job")
    @Lob
    private String requireJob;
    @Lob
    private String welfare; // phúc lợi
    private String language;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private JobStatus status;

    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private Recruiter recruiter;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "job")
    private List<Recruitment> recruitments;

}
