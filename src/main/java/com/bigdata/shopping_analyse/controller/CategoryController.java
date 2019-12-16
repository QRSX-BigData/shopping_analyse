package com.bigdata.shopping_analyse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.CategoryService;

// 跳转到分类页面
@Controller
public class CategoryController { 
	@Autowired CategoryService categoryservice;
	
	@GetMapping("/fenlei1")
	public String category1(Model m,int id) throws Exception {
		List<Goods> shop =categoryservice.selectcategory(id);
		m.addAttribute("shop", shop);
		return "category1";
	}
}