package com.study.springbootmybatis.controller;

import com.study.springbootmybatis.entity.TestEntity;
import com.study.springbootmybatis.entity.UserInfo;
import com.study.springbootmybatis.service.TestService;
import com.study.springbootmybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService ;
    @Autowired
    private UserInfoService userInfoService ;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable String id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }
    @RequestMapping(value = "/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    public UserInfo selectByPrimaryKey(@PathVariable String id){
        System.out.println("id:" + id);
        return userInfoService.selectByPrimaryKey(id);
    }
} 