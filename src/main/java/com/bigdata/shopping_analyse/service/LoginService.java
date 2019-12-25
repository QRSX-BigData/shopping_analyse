package com.bigdata.shopping_analyse.service;

import javax.servlet.http.HttpServletRequest;

import com.bigdata.shopping_analyse.pojo.Account;

/**
 * 查询账号是否存在 service的接口层
 *
 */
public interface LoginService {
	
   String selectAccountIsExists(Account account, HttpServletRequest request);
   
}

