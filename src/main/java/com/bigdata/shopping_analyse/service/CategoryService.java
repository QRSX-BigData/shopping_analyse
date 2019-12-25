package com.bigdata.shopping_analyse.service;

import java.util.List;

import com.bigdata.shopping_analyse.pojo.Goods;
/**
 * 查询分类商品的所有内容 service的接口层
 *
 */
public interface CategoryService {

	List<Goods> selectCategory(int id);
	
}
