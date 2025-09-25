package com.example.appdev.valmerasept241.repository;


import com.example.appdev.valmerasept241.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
