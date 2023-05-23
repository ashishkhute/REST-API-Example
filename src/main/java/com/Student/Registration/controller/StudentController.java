package com.Student.Registration.controller;

import com.Student.Registration.entity.Student;
import com.Student.Registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        studentService.save(student);
        return student;
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        Student student = studentService.findById(id);
        return student;
    }

    @DeleteMapping("/delete/{id}")

    public Student deleteStudent(@PathVariable Long id){
        Student student = studentService.findById(id);
        studentService.delete(student);
        return student;
    }

    @PostMapping("/update/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student updateStudent){
        Student student = studentService.findById(id);
        student.setId(id);
        student.setFirstName(updateStudent.getFirstName());
        student.setLastName(updateStudent.getLastName());
        student.setEmail(updateStudent.getEmail());
        student.setDateOfBirth(updateStudent.getDateOfBirth());
        student.setGender(updateStudent.getGender());
        student.setMobile(updateStudent.getMobile());
        studentService.save(student);
        return student;
    }

}
