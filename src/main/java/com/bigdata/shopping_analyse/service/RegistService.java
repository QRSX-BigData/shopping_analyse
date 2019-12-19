package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Account;

public interface RegistService {
	String add(Account account);

	int get(Account account);

	Account select(String username, String password);
	
	int selectidbyname(String username);
}
