package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.GoodsDetailsService;

/**
 * 
 * 商品详情控制层
 *
 */

@Controller
public class GoodsDetailsController { 
	@Autowired GoodsDetailsService goodsdetailsservice;

	// 跳转到商品详情表
	@GetMapping("/shop01")
	public String shop(Model m,int id,HttpServletRequest request) throws Exception {
		Goods shop=goodsdetailsservice.selectgoodsdetailsbyid(id,request.getSession().getAttribute("userid"));	
		m.addAttribute("shop", shop);
		return "shop1";
	}
}