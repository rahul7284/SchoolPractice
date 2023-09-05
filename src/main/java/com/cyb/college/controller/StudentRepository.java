package com.cyb.college.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cyb.college.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    public Student findByRollNum(Long rollNum);
}
