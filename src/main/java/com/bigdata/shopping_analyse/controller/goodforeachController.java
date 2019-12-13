package com.bigdata.shopping_analyse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;

@Controller
public class goodforeachController { 
	@Autowired GoodsMapper goodsmapper;

	@GetMapping("/shop01")//控制层的获取方法必须要和url 的方法 要一致   就像是dopost 和doget 一样
	public String shop(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);	
		m.addAttribute("shop", shop);
		m.addAttribute("id", id);
		return "shop1";
	}


}