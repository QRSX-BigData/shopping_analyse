package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Mapper
public interface ShowShoppingCarMapper {
	@Insert("insert into shopping_car_info(user_id,goods_id) values(#{user_id},#{goods_id})")
	int insertgoods(ShoppingCar s);
}
