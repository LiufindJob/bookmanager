package com.lyliu.java.bookmanager;

import com.lyliu.java.bookmanager.bean.UserBean;
import com.lyliu.java.bookmanager.service.UserService;
import com.lyliu.java.bookmanager.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookmanagerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
//        UserBean userBean1 = UserServiceImpl.loginIn("a", "b");
        UserBean userBean = userService.userLoginIn("a","aaa");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
