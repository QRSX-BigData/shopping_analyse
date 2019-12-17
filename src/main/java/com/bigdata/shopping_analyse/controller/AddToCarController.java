package com.bigdata.shopping_analyse.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsDetailsMapper;
import com.bigdata.shopping_analyse.service.AddToCarService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AddToCarController {
	@Autowired AddToCarService addtocarservice;
	@Autowired GoodsDetailsMapper goodsdetailsmapper;
//	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AddToCarController.class);
	// 添加商品到购物车
	@RequestMapping("/addtocar")
	public String listCategory(Model m, HttpServletRequest request, int id) throws Exception {
		
		//如果没有登录,跳转到登录页面
		if(request.getSession().getAttribute("userid") == null) {
			return "login";
		}else {
			addtocarservice.addgoods(id, (int) request.getSession().getAttribute("userid"));
			m.addAttribute("shop", goodsdetailsmapper.selectgoodsdetails(id));
			log.info("这是log4j2的日志测试，info级别");
			log.warn("这是log4j2的日志测试，warn级别");
			log.debug("这是log4j2的日志测试，debug级别");
			return "shop1";
		}
	}
}
