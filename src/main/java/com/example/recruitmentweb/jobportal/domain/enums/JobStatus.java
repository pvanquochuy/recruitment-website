package com.example.recruitmentweb.jobportal.domain.enums;

/**
 * Job status enum
 */
public enum JobStatus {
    ENABLE("ENABLE"),
    DISABLE("DISABLE");

    private String value;

    JobStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
