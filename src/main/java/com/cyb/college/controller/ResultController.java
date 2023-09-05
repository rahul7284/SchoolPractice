package com.cyb.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.college.entity.Results;
import com.cyb.college.entity.Student;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ResultController {
    @Autowired
    private ResultRespository resultRepo;
    
    @PostMapping(path = "/saveResult")
    public Results saveResult(@RequestBody Results resultDTO) {
        Student st = new Student();
        st.setId(resultDTO.getId());
        resultDTO.setStudent(st);
        return resultRepo.save(resultDTO);
    }
}
