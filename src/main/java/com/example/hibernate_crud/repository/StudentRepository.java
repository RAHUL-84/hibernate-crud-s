package com.example.hibernate_crud.repository;

import com.example.hibernate_crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
