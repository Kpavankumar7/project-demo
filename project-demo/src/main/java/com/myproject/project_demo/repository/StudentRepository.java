package com.myproject.project_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myproject.project_demo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

