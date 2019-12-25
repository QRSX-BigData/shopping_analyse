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

/**
 * 支付实现层
 * @author kingz
 *
 */
@Service("PaymentService")
@Slf4j
public class PaymentServiceImpl implements PaymentService{
	@Autowired PaymentMapper paymentmapper;
	@Autowired AddToCarMapper addtocarmapper;
	
	public boolean insertOne(int goodsid, int userid) {
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		// new Date()为获取当前系统时间
		Order o = new Order();
		o.setOrder_id(df.format(new Date())+userid);
		o.setGoods_id(goodsid);
		if(paymentmapper.insertOne1(o)> 0) {
			log.warn(addtocarmapper.selectGoodsType(goodsid)+" "+3+" "+userid+" "+goodsid+" "+2+" "+paymentmapper.selectGoodsprice(goodsid));
			return true;
		}else {
			log.warn(addtocarmapper.selectGoodsType(goodsid)+" "+3+" "+userid+" "+goodsid+" "+3 +" "+0);
			return false;
		}
//		return paymentmapper.insertone1(o)> 0 ? true:false;
	}

	public boolean insertMore(Order order) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
