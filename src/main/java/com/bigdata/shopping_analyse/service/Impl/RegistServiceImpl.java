package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.RegistMapper;
import com.bigdata.shopping_analyse.pojo.Account;
import com.bigdata.shopping_analyse.service.RegistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RegistServiceImpl implements RegistService {
	@Autowired
	RegistMapper registMapper;

	/*
	 * if(registService.get(s)==0){ //将密码设置为MD5加密
	 * s.setPassword(DigestUtils.md5DigestAsHex(s.getPassword().getBytes()));
	 * //添加到数据库中 if(registService.add(s)==1) { Log.warn("0"); return "success";
	 * }else{ return "false"; } }else{ return "false"; }
	 */

	public String add(Account s) {
		//注册的用户不存在
		if (registMapper.get(s) == 0) {
			//用户注册成功
			if (registMapper.add(s) == 1) {
				//注册成功埋点
				log.warn(0+" "+5+" "+registMapper.selectidbyname(s.getUsername())+" "+0+" "+2);
				return "success";
			} else {
				//注册失败埋点
				log.warn(0+" "+5+" "+registMapper.selectidbyname(s.getUsername())+" "+0+" "+3);
				return "false";
			}
		} else {
			//注册的用户已经存在埋点
			//注册失败埋点
			log.warn(0+" "+5+" "+registMapper.selectidbyname(s.getUsername())+" "+0+" "+1);
			return "false";
		}
	}

	public int get(Account account) {
		return registMapper.get(account);
	}

	public Account select(String username, String password) {
		return registMapper.select(username, password);
	}

	public int selectidbyname(String username) {
		return registMapper.selectidbyname(username);
	}

}
