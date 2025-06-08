package com.bor3i.student_management_system;

import java.util.List;

public class StudentRequest {
    private String name;
    private String email;
    private List<Integer> subjectIds;

    public StudentRequest(String name, String email, List<Integer> subjectIds) {
        this.name = name;
        this.email = email;
        this.subjectIds = subjectIds;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Integer> getSubjectIds() {
        return subjectIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubjectIds(List<Integer> subjectIds) {
        this.subjectIds = subjectIds;
    }
}
