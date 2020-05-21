package com.study.springbootmybatis.service;

import com.study.springbootmybatis.dao.UserInfoMapper;
import com.study.springbootmybatis.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserInfoService
 * <p>
 * <p><a href="UserInfoService.java.html"><i>View Source</i></a></p>
 *
 * @author <a href="mailto:afteryuan@gmail.com">Spires</a>
 * @version 1.0
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectByPrimaryKey(String id){
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
