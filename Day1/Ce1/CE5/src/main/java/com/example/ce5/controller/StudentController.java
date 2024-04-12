package com.example.ce5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce5.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> methodName()
    {
      List<Student>l=new ArrayList<>();
      l.add(new Student("John","welcome!"));
      return l;
    }
}
