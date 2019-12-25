package com.bigdata.shopping_analyse.service;

/**
 * 展示购物车中的所有内容 service的接口层
 *
 */
public interface AddToCarService {
	
	int addgoods(int goodsid, int userid);
	int selectGoodstype(int goodsid);
}
