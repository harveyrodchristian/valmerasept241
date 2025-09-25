package com.example.appdev.valmerasept241.repository;

import com.example.appdev.valmerasept241.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
