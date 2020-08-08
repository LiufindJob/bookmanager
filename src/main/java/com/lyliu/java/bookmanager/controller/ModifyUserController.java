package com.lyliu.java.bookmanager.controller;

import com.lyliu.java.bookmanager.bean.BookReaderBean;
import com.lyliu.java.bookmanager.service.BookReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ModifyUserController {
    @Autowired
    BookReaderService bookReaderService;

    /**
     * 查询读者信息
     */
    /*
    ModelMap对象主要用于传递控制方法处理数据到结果页面，
    也就是说我们把结果页面上需要的数据放到ModelMap对象中即可，
    他的作用类似于request对象的setAttribute方法的作用，用来在一个请求过程中传递处理的数据。
     */
    @RequestMapping("/bookreader")
    public String getUsersInfo(ModelMap modelMap) {
        ArrayList<BookReaderBean> bookReaderList= bookReaderService.getBookReadersInfo();
        modelMap.addAttribute("bookReaderList", bookReaderList);//注：这个地方一定要添加“”的字符串名字
        return "bookreader"; //返回页面（可能hml是String类型的变量吧）
    }
    /**
     * 查询指定读者信息
     */
    @RequestMapping(value = "/bookreader+{code}")
    public String getUserId(@PathVariable("code") String code, ModelMap modelMap){
        //获取读者信息
        //跳转修改页面
        //显示指定用户信息
        BookReaderBean bookReader = bookReaderService.getBookReaderInfo(code);
        modelMap.addAttribute("bookReader", bookReader);
        return "bookreaderinfo";
    }

    /**
     * 修改读者信息并以弹窗的形式返回结果
     * @param bookReaderBean
     * @return
     */

    @RequestMapping("/modifybookreader")
    @ResponseBody
    public Map modifyBookReader(BookReaderBean bookReaderBean){//（疑：为什么返回的是Map）
        int flag = bookReaderService.updateBookReader(bookReaderBean);
        System.out.println("flag update:"+flag);
        Map<String, Object> map= new HashMap<>();//(疑：为什么是object类型的，而不是string 类型的)
        if (flag == 1){//说明更新成功
            map.put("msg", "修改信息成功");//（疑：msg为什么要加引号）
        }else{//说明更新失败
            map.put("msg", "修改信息失败");
        }
        return map;
    }

    /**
     * 删除读者信息
     */
    @RequestMapping(value = "/deletebookreader+{code}")
    public String deleteUser(@PathVariable("code")  String code, ModelMap modelMap){//从URL中的占位符中获取数值
        //先删除
        //再查询
        //再进行页面跳转
        int flag = bookReaderService.dropBookReader(code);
        ArrayList<BookReaderBean> bookReaderList = bookReaderService.getBookReadersInfo();
        modelMap.addAttribute("bookReaderList",bookReaderList);//这个地方一定要写对！！
        System.out.println("flag:"+flag);
        if (flag == 0)
            return "error";
        else return "bookreader";


    }

    /**
     * 增加读者信息
     */
    @RequestMapping("/addbookreader")
    @ResponseBody
    public Map addBookReader(BookReaderBean bookReaderBean){
        int flag = bookReaderService.addBookReader(bookReaderBean);
        Map<String,Object> map = new HashMap<String,Object>();
        if(flag == 1){
            map.put("msg","新增用户成功");
            return map;
        }else {
            map.put("msg","新增用户失败");
            return map;
        }
    }










}
