package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.AddToCarMapper;
import com.bigdata.shopping_analyse.pojo.ShoppingCar;
import com.bigdata.shopping_analyse.service.AddToCarService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddToCarServiceImpl implements AddToCarService {
	@Autowired
	AddToCarMapper addtocarMapper;

	public int addgoods(int goods_id) {
		// 这里本次服务的业务
		ShoppingCar s = new ShoppingCar();
		return addtocarMapper.insertgoods(s);
	}

	static Object getuserid(HttpServletRequest request) {
		// 这里模拟
		HttpSession session = request.getSession();
		// 把登录名放到session中
		session.setAttribute("userid", 1);
		return request.getSession().getAttribute("userid");
	}
}
