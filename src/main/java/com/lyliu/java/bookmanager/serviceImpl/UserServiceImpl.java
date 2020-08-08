package com.lyliu.java.bookmanager.serviceImpl;


import com.lyliu.java.bookmanager.bean.BookReaderBean;
import com.lyliu.java.bookmanager.bean.UserBean;
import com.lyliu.java.bookmanager.mapper.UserMapper;
import com.lyliu.java.bookmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean userLoginIn(String name, String password) {
        return userMapper.getUserLoginIn(name, password);
    }

    @Override
    public UserBean userLoginInName(String name){
        return userMapper.getuserLoginInName(name);
    }


}
