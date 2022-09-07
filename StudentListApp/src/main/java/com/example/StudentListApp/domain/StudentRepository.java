package com.example.StudentListApp.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository {

    List<Student> findByLastName(String lastName);
    
}