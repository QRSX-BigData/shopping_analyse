package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.mapper.RegistMapper;
import com.bigdata.shopping_analyse.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistController {
    @Autowired RegistMapper registMapper;
    //注册
    @RequestMapping("/register")
    public String add(@RequestBody User s) throws Exception {
        //userService.get方法查出用户名为输入的用户名的个数，如果是0个就允许插入
        int su =registMapper.get(s);
        if(su==0){
            String md5PassWord = DigestUtils.md5DigestAsHex(s.getUserpwd().getBytes());
            System.out.println(s.getUsername());
            System.out.println(s.getUserpwd());
            s.setUserpwd(md5PassWord);
            registMapper.add(s);
            return "success";
        }else return "false";
    }
}
