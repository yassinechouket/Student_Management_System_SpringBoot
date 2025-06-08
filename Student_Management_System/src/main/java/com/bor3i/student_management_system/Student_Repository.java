package com.bor3i.student_management_system;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repository extends JpaRepository<Student, Integer> {
}
