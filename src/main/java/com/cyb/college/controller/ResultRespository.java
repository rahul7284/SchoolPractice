package com.cyb.college.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cyb.college.entity.Results;

@Repository
public interface ResultRespository extends CrudRepository<Results, Long> {
}
