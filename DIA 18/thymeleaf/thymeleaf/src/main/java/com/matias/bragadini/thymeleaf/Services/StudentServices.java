package com.matias.bragadini.thymeleaf.Services;


import com.matias.bragadini.thymeleaf.model.Student;
import com.matias.bragadini.thymeleaf.model.User;
import com.matias.bragadini.thymeleaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    private StudentRepository sr;

    public List<Student> getAllStudents(){
        return sr.findAll();
    }

    public Student getStudent(long id){
        return sr.getById(id);
    }

    public Student saveStudent(Student s){
        return sr.save(s);
    }

}
