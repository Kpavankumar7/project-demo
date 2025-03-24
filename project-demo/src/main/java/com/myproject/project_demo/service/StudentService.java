package com.myproject.project_demo.service;


import com.myproject.project_demo.entity.Student;
import com.myproject.project_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id) {
        Student studentDetails = getStudentById(id);
        studentDetails.setFirstName(studentDetails.getFirstName());
        studentDetails.setLastName(studentDetails.getLastName());
        studentDetails.setEmail(studentDetails.getEmail());
        studentDetails.setPhone(studentDetails.getPhone());
        studentDetails.setAddress(studentDetails.getAddress());
        return studentRepository.save(studentDetails);
    }

    public boolean deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return false;
    }
}
