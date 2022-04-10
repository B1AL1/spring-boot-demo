package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    //dodanie użytkowników z poziomu kodu
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student konrad = new Student(
                    1L,
                    "Konrad",
                    "konrad.kalman@pollub.edu.pl",
                    LocalDate.of(1999, Month.FEBRUARY, 19)
            );

            Student kacper = new Student(
                    2L,
                    "Kacper",
                    "kaper.kasinski@pollub.edu.pl",
                    LocalDate.of(2000, Month.MARCH, 16)
            );

            repository.saveAll(
                    List.of(konrad, kacper)
            );
        };
    }
}
