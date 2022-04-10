package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//kontroler dla studentów
@RestController
@RequestMapping(path = "api/v1/student") //endpoint dla http requestów
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //wypisanie studentów za pomocą GET request
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudents();
    }

    //dodanie nowego studenta za pomocą POST request
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    //usunięcie studenta za pomocą DELETE request
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
}
