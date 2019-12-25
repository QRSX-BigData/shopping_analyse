package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;
/**
 * 
 * 查询全部商品mapper层
 *
 */
@Mapper
public interface GoodsMapper {
	
	//查询全部商品信息
	@Select("select goods_id_key,goods_name,goods_price,goods_num,goods_type,create_id,create_time,update_id,update_time from goods_info")
	List<Goods> findAll();
}
