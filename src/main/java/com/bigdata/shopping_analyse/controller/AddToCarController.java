package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.AddToCarService;

@Controller
public class AddToCarController {
	@Autowired
	AddToCarService addtocarservice;
	@Autowired GoodsMapper goodsmapper;
	// 添加商品到购物车
	@RequestMapping("/addtocar")
	public String listCategory(Model m,HttpServletRequest request,int id) throws Exception {
		//模拟用户登录
		HttpSession session = request.getSession();
		session.setAttribute("userid", 1);

		// 测试结果
		System.out.println(addtocarservice.addgoods(id,(int) request.getSession().getAttribute("userid")));
		Goods shop=goodsmapper.findsome(id);	
		m.addAttribute("shop", shop);
		m.addAttribute("id", id);

		return "shop1";
	}
}
