package com.lyliu.java.bookmanager.mapper;

import com.lyliu.java.bookmanager.bean.BookReaderBean;
import com.lyliu.java.bookmanager.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    UserBean getUserLoginIn(String name, String password);
    UserBean getuserLoginInName(String name);



}
