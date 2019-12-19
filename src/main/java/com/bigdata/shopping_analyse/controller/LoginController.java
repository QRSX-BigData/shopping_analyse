package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.LoginService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 登录控制层
 *
 */
@RestController
// 登陆跳转控制层
public class LoginController {
	@Autowired
	LoginService loginService;

	// 登陆
	@RequestMapping("/login1")
	public String select(@RequestBody Account account, HttpServletRequest request) throws Exception {
		
		//登录成功"success" 失败返回 "false"
		return loginService.selectAccountIsExists(account,request);
	}
	
}
