package com.lyliu.java.bookmanager.controller;

import com.lyliu.java.bookmanager.bean.UserBean;
import com.lyliu.java.bookmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String login(String username,String password){
        UserBean userBean = userService.userLoginIn(username,password);
        System.out.println("name:"+username+"\t"+"password:"+password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }


}
