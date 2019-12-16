package com.bigdata.shopping_analyse.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.ShowShoppingCarMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Controller
public class ShowShoppingCarController {
	@Autowired ShowShoppingCarMapper showshoppingcarmapper;

	// 查看当前用户的购物车里的商品
	@RequestMapping("/ShowCarList")
	public String listShoppingCar(Model m, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();

		// 获取session中的userid
		session.setAttribute("userid", 1);
		int userid = (int) session.getAttribute("userid");
		System.out.println("userid:" + userid);

		// 根据userid 查询购物车内商品id ,根据商品id查询商品详情信息
		ShoppingCar s = new ShoppingCar();
		s.setUser_id(userid);
		List<Goods> goodslist = showshoppingcarmapper.selectGoodsInCarByUserid(s);
		m.addAttribute("goodslist",goodslist);
		// 打印测试
		// for(Goods g : goodslist) {
		// System.out.println(g.toString());
		// }
		// 移除session里的userid
		// session.removeAttribute("userid");

		return "cs_shoppingcarList";
	}
}
