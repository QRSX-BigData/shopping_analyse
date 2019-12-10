package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @Autowired RegistService registService;
    //登陆
    @RequestMapping("/login")
    public String select(@RequestBody Account account) throws Exception {
        String username  = account.getUsername();
        String password = DigestUtils.md5DigestAsHex(account.getPassword().getBytes());
        Account u =registService.select(username,password);
        if (u==null){
            return "false";
        }else {
            return "success";
        }
    }
    //登陆页面跳转
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

}
