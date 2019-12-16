package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsDetailsMapper;
import com.bigdata.shopping_analyse.service.AddToCarService;

@Controller
public class AddToCarController {
	@Autowired AddToCarService addtocarservice;
	@Autowired GoodsDetailsMapper goodsdetailsmapper;

	// 添加商品到购物车
	@RequestMapping("/addtocar")
	public String listCategory(Model m, HttpServletRequest request, int id) throws Exception {
	
		addtocarservice.addgoods(id, (int) request.getSession().getAttribute("userid"));
		m.addAttribute("shop", goodsdetailsmapper.selectgoodsdetails(id));
		return "shop1";
	}
}
