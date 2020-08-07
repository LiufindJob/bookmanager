package com.lyliu.java.bookmanager.mapper;

import com.lyliu.java.bookmanager.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    UserBean getInfo(String name, String password);
}
