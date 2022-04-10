package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//interfejs oparty na gotowym repozytorium JPA
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //metoda do wyszukiwania studenta po emailu
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
