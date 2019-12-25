package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Order;
/**
 * 支付 service的接口层
 *
 */
public interface PaymentService {
	
	boolean insertOne(int goodsid, int userid);

	boolean insertMore(Order order);
}
