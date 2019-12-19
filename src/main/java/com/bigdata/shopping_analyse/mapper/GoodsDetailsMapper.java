package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;

@Mapper
public interface GoodsDetailsMapper {
	
	//通过商品id 查询 该商品全部信息
	@Select("select goods_id_key,goods_name,goods_price,goods_num,goods_type,create_id,create_time,update_id,update_time from goods_info where goods_info.goods_id_key = #{id}")
	Goods selectGoodsDetails(int id);

}
