package com.study.springbootmybatis.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.springbootmybatis.dao.DemoMapper;
import com.study.springbootmybatis.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DemoService
 * <p>
 * <p><a href="DemoService.java.html"><i>View Source</i></a></p>
 *
 * @author <a href="mailto:afteryuan@gmail.com">Spires</a>
 * @version 1.0
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public Demo getById(String id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    public Page<Demo> getDemoList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
//        demoMapper.getDemoList();
//        return demoList;
        return null;
    }
}
