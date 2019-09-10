package com.example.demo.pojo;

import javax.persistence.*;

@Entity
public class School {
    private Integer id;
    private String name;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;

        if (id != null ? !id.equals(school.id) : school.id != null) return false;
        if (name != null ? !name.equals(school.name) : school.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
