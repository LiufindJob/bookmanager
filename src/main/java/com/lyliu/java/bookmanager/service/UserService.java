package com.lyliu.java.bookmanager.service;

import com.lyliu.java.bookmanager.bean.BookReaderBean;
import com.lyliu.java.bookmanager.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    UserBean userLoginIn(String name, String password);
    UserBean userLoginInName(String name);

}
