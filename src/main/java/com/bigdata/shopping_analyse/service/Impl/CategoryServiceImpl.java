package com.bigdata.shopping_analyse.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bigdata.shopping_analyse.mapper.CategoryMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.CategoryService;
/**
 * 分类信息实现层
 * @author kingz
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired CategoryMapper categorymapper;
	public List<Goods> selectCategory(int id) {
		return categorymapper.selectCategory(id);
	}

}
