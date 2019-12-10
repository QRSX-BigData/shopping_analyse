package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.pojo.User;



public interface RegistService {
    public int add(Account account);
    public int get(Account account);
    public Account select(String username, String password);
}
