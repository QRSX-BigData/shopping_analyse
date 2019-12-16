package com.bigdata.shopping_analyse.service;

import java.util.List;

import com.bigdata.shopping_analyse.pojo.Goods;

public interface ShowShoppingCarService {
	List<Goods> selectGoodsInCarByUserid(int userid);
}
