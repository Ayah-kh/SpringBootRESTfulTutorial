package com.tutorial.SpringBootRESTfulTutorial.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "employees",
uniqueConstraints = {
        @UniqueConstraint(name ="employeeId_unique",columnNames = "employeeId")
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String employeeId;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

}
