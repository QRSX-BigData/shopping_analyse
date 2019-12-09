package com.bigdata.shopping_analyse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.ShoppingInfoMapper;
import com.bigdata.shopping_analyse.pojo.ShowGoods;

@Controller
public class ShowGoodsController { 
	@Autowired ShoppingInfoMapper shoppinginfomapper;
	@RequestMapping("/shoppinginfo") 
	public String listCategory(Model m) throws Exception {
		List<ShowGoods> shop=shoppinginfomapper.findall();
		for(ShowGoods s : shop) {
			System.out.println(s.getGoods_id()+s.getGoods_name());
		}
		
		System.out.println(shoppinginfomapper.count()); 
		m.addAttribute("shop", shop);
		return "shopping_info";
	}
}
