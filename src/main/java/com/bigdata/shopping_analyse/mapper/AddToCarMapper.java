package com.bigdata.shopping_analyse.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.ShoppingCar;

@Mapper
public interface AddToCarMapper {
	// 添加到购物车
	@Insert("insert into shopping_car_info(user_id,goods_id) values(#{user_id},#{goods_id})")
	int insertGoods(ShoppingCar s);

	// 添加到购物车前判断是否已经存在
	@Select("select count(goods_id) from shopping_car_info where user_id = #{user_id}  and  goods_id = #{goods_id}")
	int selectGoodsIsExist(ShoppingCar s);

	// 通过商品id查询商品类别
	@Select("select goods_type from goods_info where goods_id_key = #{goods_id}")
	int selectGoodsType(int goodsid);
}
