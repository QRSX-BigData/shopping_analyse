package com.bigdata.shopping_analyse.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;

/**
 * 
 * 全部商品控制层
 *
 */
@Controller
public class GoodsController { 
	@Autowired GoodsMapper goodsmapper;
	@RequestMapping("/goodsList") 
	//全部商品展示
	public String listCategory(Model m) throws Exception {
		List<Goods> shop=goodsmapper.findAll();
		m.addAttribute("shop", shop);
		return "allgoods";
	}
	 
	//登录成功后跳转到主页面
	@RequestMapping("/main") 
	public String listmain() throws Exception {
		return "index";
	}
	//退出登录
	@RequestMapping("/out")
	public String out( HttpServletRequest request) throws Exception {
		// 把session中登录id移除
		request.getSession().removeAttribute("userid");
		return "index";
	}
}