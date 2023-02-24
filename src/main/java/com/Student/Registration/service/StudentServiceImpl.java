package com.Student.Registration.service;

import com.Student.Registration.dao.StudentRepository;
import com.Student.Registration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> studentResult = studentRepository.findById(id);
        Student student = null;
        if(studentResult.isPresent()){
            student=studentResult.get();
        }
        return student;
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

}

