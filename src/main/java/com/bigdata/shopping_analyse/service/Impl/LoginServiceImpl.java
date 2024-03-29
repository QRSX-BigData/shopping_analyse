package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.LoginMapper;
import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.LoginService;
import com.bigdata.shopping_analyse.service.RegistService;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * 登陆实现层
 * @author kingz
 *
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
    @Autowired LoginMapper loginmapper;
    @Autowired RegistService registService;
	public String selectAccountIsExists(Account account, HttpServletRequest request) {
		
		// 前台已经处理了,以防万一，账号密码为空
		if(account.getUsername() == null || account.getPassword() == null) {
			log.warn(0+" "+4+" "+0+" "+0+" "+2 +" "+0);
			return "false";
		}
		//登录时用户不存在
		if(loginmapper.selectAccountIsExists(account.getUsername(),DigestUtils.md5DigestAsHex(account.getPassword().getBytes())) == null) {
			//登录失败埋点
			log.warn(0+" "+4+" "+0+" "+0+" "+3 +" "+0);
			return "false";
		}else {
			//登录时用户存在
			// 把用户id放到session中
			request.getSession().setAttribute("userid", (int)registService.selectIdByName(account.getUsername()));
			//登录成功埋点
			log.warn(0+" "+4+" "+registService.selectIdByName(account.getUsername())+" "+0+" "+2 +" "+0);
			return "success";
		}
	}
}
