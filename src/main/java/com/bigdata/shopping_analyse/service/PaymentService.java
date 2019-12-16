package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Order;
/*
 * server层接口
 */
public interface PaymentService {
	
	//在详情页支付单个商品
	boolean insertone(int goodsid, int userid);

	//在购物车页支付单个或多个商品
	boolean insertmore(Order order);
}
