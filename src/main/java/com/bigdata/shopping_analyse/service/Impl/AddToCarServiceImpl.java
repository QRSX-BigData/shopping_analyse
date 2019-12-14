package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.AddToCarMapper;
import com.bigdata.shopping_analyse.pojo.ShoppingCar;
import com.bigdata.shopping_analyse.service.AddToCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddToCarServiceImpl implements AddToCarService {
	@Autowired
	AddToCarMapper addtocarMapper;

	@Override
	public int addgoods(int goodsid, int userid) {
		// 这里本次服务的业务
		// 添加之前判断该用户购物车中的 商品id是否已经存在，如果存在就不插入，返回1
		// 如果不存在 将 商品id 添加到购物车 添加成功返回2
		// 添加失败返回3

		ShoppingCar s = new ShoppingCar();
		s.setUser_id(userid);
		s.setGoods_id(goodsid);
		// 商品已存在,就不用添加
		if (addtocarMapper.selectGoodsIsExist(goodsid) > 0) {
			return 1;
		} else {                                               
			// 添加成功返回2
			if (addtocarMapper.insertgoods(s) == 1) {//
				return 2;
			} else {
			// 添加失败返回3
				return 3;
			}
		}
	}
}
