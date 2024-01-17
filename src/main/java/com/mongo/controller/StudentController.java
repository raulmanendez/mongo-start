package com.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mongo.collections.Student;
import com.mongo.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService userService;

    @GetMapping
    public List<Student> getAllStudents() {
        return userService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return userService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student user) {
        return userService.createStudent(user);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student user) {
        userService.updateStudent(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        userService.deleteStudent(id);
    }
}
