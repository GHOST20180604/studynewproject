package com.study.springbootmybatis.dao;

import com.study.springbootmybatis.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(String id);

} 