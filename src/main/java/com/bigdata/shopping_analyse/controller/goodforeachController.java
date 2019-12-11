package com.bigdata.shopping_analyse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;

@Controller
public class goodforeachController { 
	@Autowired GoodsMapper goodsmapper;

	@GetMapping("/shop01")
	public String shop(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);	
		m.addAttribute("shop", shop);
		return "shop1";
	}
	@GetMapping("/shop02")
	public String shop2(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);
		m.addAttribute("shop", shop);
		return "shop2";
	}
	@GetMapping("/shop03")
	public String shop3(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);
		m.addAttribute("shop", shop);
		return "shop3"; 
	}
	@GetMapping("/shop04")
	public String shop4(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);
		m.addAttribute("shop", shop);
		return "shop4";
	}
	@GetMapping("/shop05")
	public String shop5(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);
		m.addAttribute("shop", shop);
		return "shop5";
	}
	@GetMapping("/shop06")
	public String shop6(Model m,int id) throws Exception {
		Goods shop=goodsmapper.findsome(id);
		m.addAttribute("shop", shop);
		return "shop6";
	}
}