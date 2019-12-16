package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Account;

//注册接口
public interface RegistService {
    public int add(Account account);
    public int get(Account account);
}
