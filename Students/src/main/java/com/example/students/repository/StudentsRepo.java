package com.example.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.students.model.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long> {

}
