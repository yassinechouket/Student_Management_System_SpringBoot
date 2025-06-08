package com.bor3i.student_management_system;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;


    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>>getAllStudents() {
        List<Student>students=studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody StudentRequest request) {
        Student student = new Student(request.getName(), request.getEmail());
        Student createdStudent;
        createdStudent = studentService.createStudent(student, request.getSubjectIds());
        return ResponseEntity.ok(createdStudent);
    }

}
