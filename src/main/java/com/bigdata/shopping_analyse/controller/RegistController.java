package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;


@RestController
//注册的Controller层
public class RegistController {
    @Autowired RegistService registService;
    //注册
    @RequestMapping("/register")
    public String add(@RequestBody Account s) throws Exception {
        if(registService.get(s)==0){
            //将密码设置为MD5加密
            s.setPassword(DigestUtils.md5DigestAsHex(s.getPassword().getBytes()));
            //添加到数据库中
            registService.add(s);
            return "success";

        }else{
            return "false";
        }
    }
}
