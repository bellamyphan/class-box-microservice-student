package com.bellamyphan.microservice_student.repository;

import com.bellamyphan.microservice_student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Jpa will automatically implement the basic CRUD operations

    List<Student> findAllBySchoolId(Integer schoolId);
}
