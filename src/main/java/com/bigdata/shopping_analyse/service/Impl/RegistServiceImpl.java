package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.RegistMapper;
import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistServiceImpl implements RegistService {
    @Autowired RegistMapper registMapper;

    @Override
    public int add(Account account) {
        return registMapper.add(account);
    }

    @Override
    public int get(Account account) {
        return registMapper.get(account);
    }

    @Override
    public Account select(String username, String password){
        return registMapper.select(username, password);
    }
}
