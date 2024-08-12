package com.example.recruitmentweb.jobportal.domain.enums;

/**
 * Role name enum
 */
public enum RoleName {
    ROLE_JOBSEEKER("ROLE_JOBSEEKER"), // Ứng viên
    ROLE_ADMIN("ROLE_ADMIN"), // Quản trị viên
    ROLE_RECRUITER("ROLE_RECRUITER"); // Nhà tuyển dụng


    private String value;

    RoleName(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
