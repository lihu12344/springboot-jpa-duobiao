package com.example.demo.dao;

import com.example.demo.pojo.StudentCount;
import com.example.demo.pojo.StudentInfo;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<StudentInfo> get(){
        String sql="select a.id,a.name,a.age,b.name as schoolName from student a,school b where a.school_id=b.id";
        Query query=entityManager.createNativeQuery(sql).setFirstResult(0).setMaxResults(10);

        return query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.aliasToBean(StudentInfo.class)).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<StudentCount> count(){
        String sql="select b.name as schoolName,count(*) as count from student a,school b where a.school_id=b.id group by b.name order by 2 desc,b.name asc ";
        Query query=entityManager.createNativeQuery(sql);

        return query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.aliasToBean(StudentCount.class)).getResultList();
    }
}
