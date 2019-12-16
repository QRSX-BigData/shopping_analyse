package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Account;

//登陆接口
public interface LoginService {
    public Account select(String username, String password);
}
