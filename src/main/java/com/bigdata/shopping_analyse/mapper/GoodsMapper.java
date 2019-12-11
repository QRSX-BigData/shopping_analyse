package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;

@Mapper
public interface GoodsMapper {
	@Select("select * from goods_info")
	List<Goods> findall();
	@Select("select count(*) from goods_info")
	int count();
	@Select("select * from goods_info where goods_info.goods_id_key = #{id}")
	Goods findsome(int id);
	
}
