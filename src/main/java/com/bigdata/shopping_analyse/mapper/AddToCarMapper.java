package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Mapper
public interface AddToCarMapper {
	@Insert("insert into shopping_car_info(user_id,goods_id) values(#{user_id},#{goods_id})")
	int insertgoods(ShoppingCar s);
	@Select("select count(goods_id) from shopping_car_info where goods_id = #{goodsid} ")
	int selectGoodsIsExist(int goodsid);
}
