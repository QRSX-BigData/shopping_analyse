package com.bigdata.shopping_analyse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.GoodsDetailsService;

@Controller
public class GoodsDetailsController { 
	@Autowired GoodsDetailsService goodsdetailsservice;

	@GetMapping("/shop01")//控制层的获取方法必须要和url 的方法 要一致   就像是dopost 和doget 一样
	public String shop(Model m,int id) throws Exception {
		Goods shop=goodsdetailsservice.selectgoodsdetailsbyid(id);	
		m.addAttribute("shop", shop);
		return "shop1";
	}
}