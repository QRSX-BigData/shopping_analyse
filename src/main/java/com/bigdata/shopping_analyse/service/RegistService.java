package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Account;

public interface RegistService {
    public int add(Account account);
    public int get(Account account);
    public Account select(String username, String password);
}
