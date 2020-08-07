package com.lyliu.java.bookmanager;

import com.lyliu.java.bookmanager.bean.UserBean;
import com.lyliu.java.bookmanager.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookmanagerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserBean userBean = userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
