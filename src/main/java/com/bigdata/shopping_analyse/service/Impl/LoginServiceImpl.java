package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//登陆实现类
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired LoginService loginService;
    @Override
    public Account select(String username, String password) {

            return loginService.select(username, password);
    }
}
