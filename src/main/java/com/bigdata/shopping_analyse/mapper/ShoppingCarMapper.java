package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Mapper
public interface ShoppingCarMapper {
	@Insert("insert into shopping_car_info(user_id,goods_id,create_time,update_time) values(#{user_id},#{goods_id},now(),now())")
	int insertgoods(ShoppingCar s);
}
