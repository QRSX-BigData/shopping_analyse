package com.bigdata.shopping_analyse.service;

import java.util.List;

import com.bigdata.shopping_analyse.pojo.Goods;

/**
 * 展示购物车中的所有信息 service的接口层
 *
 */
public interface ShowShoppingCarService {
	

	List<Goods> selectGoodsInCarByUserid(int userid);
}
