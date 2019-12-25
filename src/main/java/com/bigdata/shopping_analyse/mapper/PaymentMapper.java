package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Order;

/**
 * 
 * 支付mapper层
 *
 */
@Mapper
public interface PaymentMapper {

	// 商品详情页的支付
	@Insert("insert into order_info (order_id,goods_id) values (#{order_id},#{user_id})")
	int insertOne(String order_id, int user_id);

	// 购物车页的支付
	@Insert("insert into order_info (order_id,goods_id) values (#{order_id},#{goods_id})")
	int insertOne1(Order order);

	// 通过商品id查询商品价格
	@Select("select goods_price from goods_info where goods_id_key = #{goods_id}")
	int selectGoodsprice(int goodsid);
}
