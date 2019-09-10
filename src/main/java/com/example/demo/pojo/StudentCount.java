package com.example.demo.pojo;

import java.math.BigInteger;
import java.util.Objects;

public class StudentCount {

    private String schoolName;
    private BigInteger count;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentCount)) return false;
        StudentCount that = (StudentCount) o;
        return Objects.equals(getSchoolName(), that.getSchoolName()) &&
                Objects.equals(getCount(), that.getCount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSchoolName(), getCount());
    }
}
