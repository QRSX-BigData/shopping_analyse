package com.bigdata.shopping_analyse.service;

import javax.servlet.http.HttpServletRequest;

import com.bigdata.shopping_analyse.pojo.Account;

//登陆接口
public interface LoginService {
   String selectAccountIsExists(Account account, HttpServletRequest request);
}
