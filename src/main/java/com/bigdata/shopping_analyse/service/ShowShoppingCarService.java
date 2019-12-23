package com.bigdata.shopping_analyse.service;

import java.util.List;

import com.bigdata.shopping_analyse.pojo.Goods;

/**
 * 展示购物车中的所有内容 的service层
 * @author acer-pc
 *
 */
public interface ShowShoppingCarService {
	List<Goods> selectGoodsInCarByUserid(int userid);
}
