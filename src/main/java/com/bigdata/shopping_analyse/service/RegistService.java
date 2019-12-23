package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Account;

/**
 * 注册页面用到的方法的接口
 * @author acer-pc
 *
 */
public interface RegistService {
	
	String add(Account account);

	int get(Account account);

	Account select(String username, String password);
	
	int selectIdByName(String username);
}
