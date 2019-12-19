package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

/**
 * 
 * 注册控制层
 *
 */
@RestController
//注册层
public class RegistController {
    @Autowired RegistService registService;
    @RequestMapping("/register")
    public String add(@RequestBody Account s) throws Exception {
    	s.setPassword(DigestUtils.md5DigestAsHex(s.getPassword().getBytes()));
    	//注册成功返回"失败返回 success"  失败返回 "false"
    	return registService.add(s);
    }
}
