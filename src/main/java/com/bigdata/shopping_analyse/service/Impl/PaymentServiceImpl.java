package com.bigdata.shopping_analyse.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bigdata.shopping_analyse.mapper.PaymentMapper;
import com.bigdata.shopping_analyse.pojo.Order;
import com.bigdata.shopping_analyse.service.PaymentService;

@Service("PaymentService")//扫描
public class PaymentServiceImpl implements PaymentService{
	@Autowired PaymentMapper paymentmapper;
	
	public boolean insertone(int goodsid, int userid) {
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		// new Date()为获取当前系统时间
		Order o = new Order();
		o.setOrder_id(df.format(new Date())+userid);
		o.setGoods_id(goodsid);
		return paymentmapper.insertone1(o)> 0 ? true:false;
	}

	public boolean insertmore(Order order) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
