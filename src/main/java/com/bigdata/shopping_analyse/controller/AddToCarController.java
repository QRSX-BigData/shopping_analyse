package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsDetailsMapper;
import com.bigdata.shopping_analyse.service.AddToCarService;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * 购物车控制层
 *
 */
@Controller
@Slf4j
public class AddToCarController {
	@Autowired
	AddToCarService addtocarservice;
	@Autowired
	GoodsDetailsMapper goodsdetailsmapper;

	// 添加商品到购物车
	@RequestMapping("/addtocar")
	public String listCategory(Model m, HttpServletRequest request, int id) throws Exception {

		// 如果没有登录,跳转到登录页面
		if (request.getSession().getAttribute("userid") == null) {
			log.warn(0+" "+2+ " " +0+ " " + id + " " + 3);
			return "login";
		} else {
			// 如果登录,跳转到商品详情页面
			addtocarservice.addgoods(id, (int) request.getSession().getAttribute("userid"));
			m.addAttribute("shop", goodsdetailsmapper.selectGoodsDetails(id));
			return "shop1";
		}
	}
}
