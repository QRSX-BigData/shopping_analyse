package com.bigdata.shopping_analyse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;

@Controller
public class GoodsController { 
	@Autowired GoodsMapper shoppinginfomapper;
	@RequestMapping("/goodsList") 
	public String listCategory(Model m) throws Exception {
		List<Goods> shop=shoppinginfomapper.findall();
		for(Goods s : shop) {
			System.out.println(s.getGoods_id_key()+s.getGoods_name());
		}
		System.out.println(shoppinginfomapper.count()); 
		m.addAttribute("shop", shop);
		return "cs_main";
	}
	
	@RequestMapping("/main") 
	public String listmain(Model m) throws Exception {
		List<Goods> shop=shoppinginfomapper.findall();
		for(Goods s : shop) {
			System.out.println(s.getGoods_id_key()+s.getGoods_name());
		}
		System.out.println(shoppinginfomapper.count()); 
		m.addAttribute("shop", shop);
		return "index";
	}
}