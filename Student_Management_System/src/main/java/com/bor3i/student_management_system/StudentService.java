package com.bor3i.student_management_system;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final Student_Repository studentRepo;
    private final Subject_Repository subjectRepo;

    public StudentService(Student_Repository studentRepo, Subject_Repository subjectRepo) {
        this.studentRepo = studentRepo;
        this.subjectRepo = subjectRepo;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepo.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }

    public Student createStudent(Student student, List<Integer> subjectIds) {
        List<Subject> subjects = subjectRepo.findAllById(subjectIds);
        student.setsubjectList(subjects);
        return studentRepo.save(student);
    }

}