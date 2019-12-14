package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.mapper.AddToCarMapper;
import com.bigdata.shopping_analyse.service.AddToCarService;

@Controller
public class AddToCarController {
	@Autowired AddToCarService addtocarservice;
	
	//添加商品到购物车
	@RequestMapping("/addtocar") 
	public String listCategory(Model m,HttpServletRequest request,int id) throws Exception {
		HttpSession session = request.getSession();
		//自定义的商品id
		int goodsid = 1;
		// 将userid goodsid 插入购物车数据库
		// 插入之前判断该用户购物车中的 商品id是否已经存在，如果存在就不插入
		// 如果不存在controller 层传前端 获取的 商品id
		
		// 根据返回的值判断，购物车商品已经存在，成功添加到购物车，添加失败
		addtocarservice.addgoods(goodsid);
		
		
		//
/*		//把登录名放到session中
//		session.setAttribute("userid", 1);
//		int userid = (int) session.getAttribute("userid");
//		System.out.println("userid:"+userid);
		
		
//		ShoppingCar s =new ShoppingCar();
//		s.setUser_id(userid);
//		s.setGoods_id(id);//我点击添加购物车 需要返回的数据就是这个  id
//		int num = shoppingcarmapper.insertgoods(s);
//		System.out.println(num);
		
	    //移除session里的userid
//		session.removeAttribute("userid");
//		Goods shop=goodsmapper.findsome(id);
//		m.addAttribute("shop", shop);
*/		
		return "cs_main";
	}
}
