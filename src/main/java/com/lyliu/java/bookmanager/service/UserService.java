package com.lyliu.java.bookmanager.service;

import com.lyliu.java.bookmanager.bean.UserBean;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserBean loginIn(String name, String password);

}
