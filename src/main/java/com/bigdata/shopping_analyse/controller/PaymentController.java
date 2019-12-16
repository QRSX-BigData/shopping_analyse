package com.bigdata.shopping_analyse.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.GoodsDetailsMapper;
import com.bigdata.shopping_analyse.pojo.Order;
import com.bigdata.shopping_analyse.service.PaymentService;
/*
 * 支付控制层
 */
@Controller
public class PaymentController {
	@Resource PaymentService paymentService;
	@Resource GoodsDetailsMapper goodsdetailsmapper;
	@RequestMapping("/paymentone") 
	//前台传商品id,controller层返回server层的处理结果，server层将姓名，商品id插入，返回处理结果
	
	//提交一个商品的订单
	public String paymentone(Model m,HttpServletRequest request, int id) throws Exception {
		//成功返回前台true,失败返回false
		m.addAttribute("status", paymentService.insertone(id, (int) request.getSession().getAttribute("userid")));
		m.addAttribute("shop", goodsdetailsmapper.selectgoodsdetails(id));
		return "shop1";
	}
	
	@RequestMapping("/paymentmore") 
	//提交1或多个商品的id 和 购买数量
	//1 server层查看商品库存是否大于购买数量 符合条件执行2
	//2   生成订单信息，
	//3   往订单明细表插入商品详情信息
	//4   计算总价格，更新
	public String paymentmore(Model m,Order order) throws Exception {
		//成功返回前台true,失败返回false
		m.addAttribute("status", paymentService.insertmore(order));
		return "cs_main";
	}
}
