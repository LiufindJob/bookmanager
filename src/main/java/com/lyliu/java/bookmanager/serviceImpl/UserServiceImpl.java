package com.lyliu.java.bookmanager.serviceImpl;


import com.lyliu.java.bookmanager.bean.UserBean;
import com.lyliu.java.bookmanager.mapper.UserMapper;
import com.lyliu.java.bookmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
