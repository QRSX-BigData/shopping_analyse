package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Mapper
public interface ShowShoppingCarMapper {
	@Select(	"select * "
			+ "from goods_info "
			+ "where goods_id_key "
			+ "in "
			+ "(select goods_id from shopping_car_info where user_id = #{user_id})")
	List<Goods> selectGoodsInCarByUserid(ShoppingCar s);
}
