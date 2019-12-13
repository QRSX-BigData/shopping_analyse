package com.bigdata.shopping_analyse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;

// 跳转到分类页面
@Controller
public class CategoryController { 
	@Autowired GoodsMapper goodsmapper;
	
	@GetMapping("/fenlei1")
	public String category1(Model m,int id) throws Exception {
		List<Goods> shop=goodsmapper.findCategory(id);
		m.addAttribute("shop", shop);
		
		return "category1";
	}
	
	

}