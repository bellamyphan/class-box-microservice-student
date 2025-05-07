package com.bellamyphan.microservice_student.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data // Lombok will generate getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "firstname", nullable = false)
    private String firstname;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "email", nullable = false, unique = true)
    @Email
    private String email;
    @Column(name = "school_id", nullable = false)
    private Long schoolId;

    // Constructor with no id
    public Student(String firstname, String lastname, String email, Long schoolId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.schoolId = schoolId;
    }
}
