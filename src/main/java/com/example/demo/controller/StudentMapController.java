package com.example.demo.controller;

import com.example.demo.dao.StudentMapRepository;
import com.example.demo.pojo.StudentMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentMapController {

    @Autowired
    private StudentMapRepository studentMapRepository;

    @RequestMapping("/get2")
    public List<StudentMap> getAll(){
        return studentMapRepository.findAll();
    }
}
