package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="student")
public class StudentMap {

    @Id
    @GeneratedValue(generator = "uuid2")
    private Integer id;
    private String name;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentMap)) return false;
        StudentMap that = (StudentMap) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAge(), that.getAge()) &&
                Objects.equals(getSchool(), that.getSchool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getSchool());
    }
}
