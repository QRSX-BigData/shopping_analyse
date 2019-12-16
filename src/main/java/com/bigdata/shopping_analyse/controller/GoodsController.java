package com.bigdata.shopping_analyse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;

//全部商品展示
@Controller
public class GoodsController { 
	@Autowired GoodsMapper goodsmapper;
	@RequestMapping("/goodsList") 
	public String listCategory(Model m) throws Exception {
		List<Goods> shop=goodsmapper.findall();
		m.addAttribute("shop", shop);
		return "cs_main";
	}
	 
//跳转到主页面
	@RequestMapping("/main") 
	public String listmain(Model m) throws Exception {
		List<Goods> shop=goodsmapper.findall();
		m.addAttribute("shop", shop);
		return "index";
	}
}