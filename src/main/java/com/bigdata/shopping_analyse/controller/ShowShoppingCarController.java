package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.ShoppingCarMapper;
import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Controller
public class ShowShoppingCarController {
	@Autowired ShoppingCarMapper shoppingcarmapper;
	
	//添加商品到购物车
	@RequestMapping("/addtocar") 
	public String listCategory(Model m,HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		
		//把登录名放到session中
		session.setAttribute("userid", 1);
		int userid = (int) session.getAttribute("userid");
		System.out.println("userid:"+userid);
		
		//将userid goodsid 插入购物车数据库
		ShoppingCar s =new ShoppingCar();
		s.setUser_id(userid);
		s.setGoods_id(1);
		int num = shoppingcarmapper.insertgoods(s);
		System.out.println(num);
		
	    //移除session里的userid
		session.removeAttribute("userid");
		
		return "cs_main";
	}
}
