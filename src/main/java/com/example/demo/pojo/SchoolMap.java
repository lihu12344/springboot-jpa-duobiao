package com.example.demo.pojo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "school")
public class SchoolMap {

    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "school")
    private List<StudentMap> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentMap> getStudents() {
        return students;
    }

    public void setStudents(List<StudentMap> students) {
        this.students = students;
    }
}
