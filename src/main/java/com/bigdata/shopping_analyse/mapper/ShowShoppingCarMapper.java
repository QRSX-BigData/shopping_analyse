package com.bigdata.shopping_analyse.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.bigdata.shopping_analyse.pojo.Goods;
/**
 * 
 * 购物车展示mapper层
 *
 */
@Mapper
public interface ShowShoppingCarMapper {
	@Select(	
			"select goods_id_key,goods_name,goods_price,goods_num,goods_type,create_id,create_time,update_id,update_time"
			+ " from goods_info"
			+ " where goods_id_key"
			+ " in"
			+ " (select goods_id from shopping_car_info where user_id = #{user_id})")
	List<Goods> selectGoodsInCarByUserid(int user_id);
}
