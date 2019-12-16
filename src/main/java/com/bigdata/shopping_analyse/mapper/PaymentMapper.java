package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.bigdata.shopping_analyse.pojo.Order;

@Mapper
public interface PaymentMapper {
	@Insert("insert into order_info (order_id,goods_id) values (#{order_id},#{user_id})")
	int insertone(String order_id, int user_id);
	
	@Insert("insert into order_info (order_id,goods_id) values (#{order_id},#{goods_id})")
	int insertone1(Order order);
}
