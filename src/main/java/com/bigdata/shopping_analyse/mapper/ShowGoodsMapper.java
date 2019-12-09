package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;

@Mapper
public interface ShowGoodsMapper {
	@Select("select * from shopping_info")
	List<Goods> findall();
	@Select("select count(*) from shopping_info")
	int count();
}
