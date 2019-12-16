package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;

@Mapper
public interface CategoryMapper {

	@Select("select * from goods_info where goods_info.goods_type = #{id} ")
	List<Goods> selectCategory(int id);
	
}
