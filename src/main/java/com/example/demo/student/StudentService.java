package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Konrad",
                        "konrad.kalman@pollub.edu.pl",
                        LocalDate.of(1999, Month.FEBRUARY, 19),
                        23
                )
        );
    }
}
