package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddToCarMapper {
	@Insert("insert into shopping_car_info(user_id,goods_id) values(#{user_id},#{goods_id})")
	int insertgoods(int s);
}
