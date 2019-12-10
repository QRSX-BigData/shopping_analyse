package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.mapper.RegistMapper;
import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.pojo.User;
import com.bigdata.shopping_analyse.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class RegistController {
    @Autowired RegistService registService;
    //注册
    @RequestMapping("/register")
    public String add(@RequestBody Account s) throws Exception {
        //userService.get方法查出用户名为输入的用户名的个数，如果是0个就允许插入
        int su =registService.get(s);
        if(su==0){
            String md5PassWord = DigestUtils.md5DigestAsHex(s.getPassword().getBytes());
            s.setPassword(md5PassWord);
            registService.add(s);
            return "success";
        }else return "false";
    }

    //注册页面跳转
    @RequestMapping(value="/regist", method= RequestMethod.GET)
    public ModelAndView regist(){
        ModelAndView mv = new ModelAndView("regist");
        return mv;
    }


}
