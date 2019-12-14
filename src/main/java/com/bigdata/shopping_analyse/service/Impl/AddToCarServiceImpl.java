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
    @Autowired AddToCarMapper addtocarMapper;

	public int addgoods(int goods_id) {
		
		//这里模拟
		HttpServletRequest request = null;
		@SuppressWarnings("null")
		HttpSession session = request.getSession();
		//把登录名放到session中
		session.setAttribute("userid", 1);
		//上面的应该是登录成功时干的
		
		//这里本次服务的业务
		//从session中获取登录名
		System.out.println("userid:"+session.getAttribute("userid"));
		
		
		ShoppingCar s = new ShoppingCar();
		s.setUser_id((int) session.getAttribute("userid"));
		s.setGoods_id(goods_id);
		return addtocarMapper.insertgoods(s);
	}

}
