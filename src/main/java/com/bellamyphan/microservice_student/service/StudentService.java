package com.bellamyphan.microservice_student.service;

import com.bellamyphan.microservice_student.model.Student;
import com.bellamyphan.microservice_student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    // Find all students by school id
    public List<Student> findAllBySchoolId(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }

    // Find all students
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // Save a student
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
