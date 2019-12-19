package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.AddToCarMapper;
import com.bigdata.shopping_analyse.mapper.GoodsDetailsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.GoodsDetailsService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodsDetailsServiceImpl implements GoodsDetailsService {
	@Autowired
	GoodsDetailsMapper goodsdetailsmapper;
	@Autowired
	AddToCarMapper addtocarmapper;

	public Goods selectgoodsdetailsbyid(int goodsid, Object userid) {
		// 未登录的用户浏览商品详情
		if (userid == null) {
			log.warn(addtocarmapper.selectGoodstype(goodsid) + " " + 1 +" "+ 0 + " " + goodsid + " " + 2);
			return goodsdetailsmapper.selectGoodsDetails(goodsid);
		} else {
			// 登录的用户浏览商品详情
			log.warn(addtocarmapper.selectGoodstype(goodsid) + " " + 1 +" "+ userid + " " + goodsid + " " + 2);
			return goodsdetailsmapper.selectGoodsDetails(goodsid);
		}
	}
}
