package com.Student.Registration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Data
@Table(name="Students")
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message="Enter the First Name")
    private String firstName;
    @NotEmpty(message="Enter the Last Name")
    private String lastName;
    @Email
    @NotEmpty(message="Enter the Email Address")
    private String email;
    @NotEmpty(message="Enter Date of Birth")
    private String dateOfBirth;
    private String gender;
    @NotNull(message="Enter Mobile Number")
    private Long mobile;

}











