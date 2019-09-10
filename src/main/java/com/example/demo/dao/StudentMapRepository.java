package com.example.demo.dao;

import com.example.demo.pojo.StudentMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMapRepository extends JpaRepository<StudentMap,Integer> {
}
