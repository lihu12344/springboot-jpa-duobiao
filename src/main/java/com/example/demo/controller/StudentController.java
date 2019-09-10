package com.example.demo.controller;

import com.example.demo.dao.SchoolRepository;
import com.example.demo.dao.StudentCustomRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.pojo.School;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentCount;
import com.example.demo.pojo.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentCustomRepository studentCustomRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SchoolRepository schoolRepository;

    @RequestMapping("/save")
    public String save(){
        for(int i=0;i<100;i++){
            Student student=new Student();

            student.setId(i);
            student.setName("瓜田李下"+i);
            student.setAge(i);
            student.setSchoolId(i%3+1);

            studentRepository.save(student);
        }

        for(int i=0;i<3;i++){
            School school=new School();

            school.setId(i+1);
            school.setName("海贼王"+i);

            schoolRepository.save(school);
        }

        return "success";
    }

    @RequestMapping("/get")
    public List<StudentInfo> get(){
        return studentCustomRepository.get();
    }

    @RequestMapping("/count")
    public List<StudentCount> count(){
        return studentCustomRepository.count();
    }
}
