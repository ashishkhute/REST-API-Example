package com.Student.Registration.service;

import com.Student.Registration.entity.Student;
import java.util.List;

public interface StudentService {


    public List<Student> getStudents();

    public void save(Student student);

    public Student findById(Long id);

    public void delete(Student student);


}
