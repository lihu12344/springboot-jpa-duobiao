package com.example.demo.controller;

import com.example.demo.dao.SchoolMapRepository;
import com.example.demo.pojo.SchoolMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolMapController {

    @Autowired
    private SchoolMapRepository schoolMapRepository;

    @RequestMapping("/get3")
    public List<SchoolMap> getAll(){
        return schoolMapRepository.findAll();
    }
}
