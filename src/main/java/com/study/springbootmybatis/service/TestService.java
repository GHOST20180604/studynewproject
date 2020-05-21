package com.study.springbootmybatis.service;

import com.study.springbootmybatis.dao.TestDao;
import com.study.springbootmybatis.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(String id){
        return testDao.getById(id);
    }
} 