package com.bor3i.student_management_system;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private final Subject_Repository subjectRepo;


    public SubjectService(Subject_Repository subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    public List<Subject> getAllSubjects() {
        return subjectRepo.findAll();
    }
    public Subject getSubjectById(int id) {
        return subjectRepo.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }
    public void deleteSubjectById(int id) {
        subjectRepo.deleteById(id);
    }
    public Subject createSubject(Subject subject) {
        return subjectRepo.save(subject);
    }
}
