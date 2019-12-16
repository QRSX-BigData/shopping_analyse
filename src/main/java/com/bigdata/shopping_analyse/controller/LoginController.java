package com.bigdata.shopping_analyse.controller;

import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.RegistService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 登陆的Controller层
public class LoginController {
	@Autowired
	RegistService registService;

	// 登陆
	@RequestMapping("/login1")
	public String select(@RequestBody Account account, HttpServletRequest request) throws Exception {
		/*
		 * String username = account.getUsername(); String userpwd =
		 * DigestUtils.md5DigestAsHex(account.getPassword().getBytes()); Account a =
		 * registService.select(account.getUsername(),DigestUtils.md5DigestAsHex(account
		 * .getPassword().getBytes())); if (a==null){ return "false"; }else{ return
		 * "success"; }
		 */

		// 把登录名放到session中
		request.getSession().setAttribute("userid", (int)registService.selectidbyname(account.getUsername()));
		// System.out.println(registService.selectidbyname(account.getUsername()));
		// 将传过来的数据调用mapper层中的方法查询，查询为null的话就不存在
		return registService.select(account.getUsername(),
				DigestUtils.md5DigestAsHex(account.getPassword().getBytes())) == null ? "false" : "success";
	}

}
