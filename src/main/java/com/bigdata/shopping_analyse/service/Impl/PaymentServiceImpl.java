package com.bigdata.shopping_analyse.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.shopping_analyse.mapper.AddToCarMapper;
import com.bigdata.shopping_analyse.mapper.PaymentMapper;
import com.bigdata.shopping_analyse.pojo.Order;
import com.bigdata.shopping_analyse.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

//扫描
@Service("PaymentService")
@Slf4j
public class PaymentServiceImpl implements PaymentService{
	@Autowired PaymentMapper paymentmapper;
	@Autowired AddToCarMapper addtocarmapper;
	
	public boolean insertone(int goodsid, int userid) {
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		// new Date()为获取当前系统时间
		Order o = new Order();
		o.setOrder_id(df.format(new Date())+userid);
		o.setGoods_id(goodsid);
		if(paymentmapper.insertone1(o)> 0) {
			log.warn(addtocarmapper.selectGoodstype(goodsid)+" "+3+" "+userid+" "+goodsid+" "+2);
			return true;
		}else {
			log.warn(addtocarmapper.selectGoodstype(goodsid)+" "+3+" "+userid+" "+goodsid+" "+3);
			return false;
		}
//		return paymentmapper.insertone1(o)> 0 ? true:false;
	}

	public boolean insertmore(Order order) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
