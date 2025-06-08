package com.bor3i.student_management_system;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();

    }
    @GetMapping("{id}")
    public Subject getSubject(@PathVariable int id) {
        return subjectService.getSubjectById(id);
    }

    @DeleteMapping("{id}")
    public void deleteSubject(@PathVariable int id) {
        subjectService.deleteSubjectById(id);
    }

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }



}
