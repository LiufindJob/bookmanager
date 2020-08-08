//package com.lyliu.java.bookmanager.config;
//
//import com.lyliu.java.bookmanager.bean.UserBean;
//import com.lyliu.java.bookmanager.common.SecurityUtil;
//import com.lyliu.java.bookmanager.service.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @Description: 自定义登录成功处理类
// * @Author lyLiu
// * @Date 2019/5/25 23:32
// **/
//@Component
//public class MyAuthenctiationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
//    @Autowired
//    UserService userService;
//
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
//        response.setContentType("application/json;charset=utf-8");
//
//        RequestCache cache = new HttpSessionRequestCache();
//        SavedRequest savedRequest = cache.getRequest(request, response);
//        // 如果来源请求为空则跳转到管理后台
//        String url = "admin";
//        /*if((savedRequest==null)){
//            url = "admin";
//        }else{
//            url = savedRequest.getRedirectUrl();
//        }*/
//
//        // 获取登录用户详细信息
//        UserBean user = userService.loginInName(SecurityUtil.getLoginUser());//疑：这个地方不知道怎么回事
//        System.out.println("url"+url);
//        request.getSession().setAttribute("loginUser",user);
//        /*
//        request.getSession()可以帮你得bai到HttpSession类型的对象，通常称du之为session对象，
//        session对象的作zhi用域为一次会话，dao通常浏览器不关闭，保存的值就不会消失，当然也会出现session超时。
//        服务器里面可以设置session的超时时间，web.xml中有一个session time out的地方，tomcat默认为30分钟
//         */
//
//        // 返回jwt
//        response.sendRedirect(url);
//    }
//}
