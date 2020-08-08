//package com.lyliu.java.bookmanager.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
///*
//如下是安全配置，使得只有认证过的用户才可以访问到问候页面:
//
// */
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    /*
//    configure(HttpSecurity)方法定义了哪些URL路径应该被保护，哪些不应该。
//    具体来说，“/”和“/ home”路径被配置为不需要任何身份验证。所有其他路径必须经过身份验证。
//     */
//
//    MyAuthenctiationSuccessHandler myAuthenctiationSuccessHandler;//成功跳转的handler
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        http
//                .authorizeRequests()
//                .antMatchers( "/home").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll().successHandler(myAuthenctiationSuccessHandler)
//                .and()
//                .logout()
//                .permitAll();
//    }
//
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth
////                .inMemoryAuthentication()
////                .withUser("user").password("password").roles("USER");
////    }
//}
