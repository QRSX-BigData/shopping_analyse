package com.bigdata.shopping_analyse.service;

import com.bigdata.shopping_analyse.pojo.Goods;

/**
 * 
 * 查询商品详情内容 service的接口层
 *
 */
public interface GoodsDetailsService {

	Goods selectgoodsdetailsbyid(int goodsid, Object attribute);
	
}
