package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Mapper
public interface ShowShoppingCarMapper {
	@Insert("insert into shopping_car_info(user_id,goods_id) values(#{user_id},#{goods_id})")
	int insertgoods(ShoppingCar s);

	@Select("select * from goods_info where goods_id_key in (select goods_id from shopping_car_info where user_id = #{user_id})")
	List<Goods> selectGoodsInCar(ShoppingCar s);
}
