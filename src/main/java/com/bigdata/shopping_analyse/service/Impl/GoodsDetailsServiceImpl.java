package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.GoodsDetailsMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.GoodsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsDetailsServiceImpl implements GoodsDetailsService {
	@Autowired GoodsDetailsMapper goodsdetailsmapper;

	@Override
	public Goods selectgoodsdetailsbyid(int id) {
		// TODO Auto-generated method stub
		return goodsdetailsmapper.selectgoodsdetails(id);
	}


}