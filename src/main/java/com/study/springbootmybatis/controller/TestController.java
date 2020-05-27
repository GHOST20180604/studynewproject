package com.study.springbootmybatis.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.springbootmybatis.dao.DemoMapper;
import com.study.springbootmybatis.entity.Demo;
import com.study.springbootmybatis.entity.TestEntity;
import com.study.springbootmybatis.service.DemoService;
import com.study.springbootmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private DemoService demoService;
    @Autowired
    private DemoMapper demoMapper;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public TestEntity test(@PathVariable String id) {
        System.out.println("id:" + id);
        ArrayList<String> strings = new ArrayList<>();
        return testService.getById(id);
    }


    @RequestMapping("/getUserList")
    public Map getUserList(Integer pageNum, Integer pageSize) {
        HashMap<String, Object> map = new HashMap<>();
        pageNum = 0;
        pageSize = 2;
        PageHelper.startPage(pageNum, pageSize);
        Page<Demo> userList = demoMapper.getDemoList();
        int pageNum1 = userList.getPageNum();
        int pageSize1 = userList.getPageSize();
        long total = userList.getTotal();
        System.out.println(pageNum1 + " = " + pageSize1 + " = " + total);
        map.put("userList",userList);
        map.put("pageNum",userList.getPageNum());
        map.put("pageSize",userList.getPageSize());
        map.put("total",userList.getTotal());
        return map;
    }
}