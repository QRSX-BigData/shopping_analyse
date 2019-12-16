package com.bigdata.shopping_analyse.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.ShowShoppingCarService;

@Controller
public class ShowShoppingCarController {
	@Autowired ShowShoppingCarService showshoppingcarservice;

	// 查看当前用户的购物车里的商品
	@RequestMapping("/ShowCarList")
	public String listShoppingCar(Model m, HttpServletRequest request) throws Exception {
		// 根据userid 查询购物车内商品id ,根据商品id查询商品详情信息
		// 如果没有登录,跳转到登录页面
		if (request.getSession().getAttribute("userid") == null) {
			return "login";
		} else {
			List<Goods> goodslist = showshoppingcarservice.selectGoodsInCarByUserid((int) request.getSession().getAttribute("userid"));
			m.addAttribute("goodslist", goodslist);
			return "shoppingcarList";
		}
	}
}
