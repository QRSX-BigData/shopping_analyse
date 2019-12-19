package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;

@Mapper
public interface CategoryMapper {
	
	//通过商品类别查询该类别的全部商品
	@Select("select goods_id_key,goods_name,goods_price,goods_num,goods_type,create_id,create_time,update_id,update_time from goods_info where goods_info.goods_type = #{id} ")
	List<Goods> selectCategory(int id);
	
}
