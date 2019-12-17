package com.bigdata.shopping_analyse.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.bigdata.shopping_analyse.pojo.Goods;

@Mapper
public interface ShowShoppingCarMapper {
	@Select(	"select user_id_key,username,userpwd,address,shopping_success_num,shopping_fail_num,total_money_shopping_success,total_money_shopping_fail,last_login_time,create_id,create_time  "
			+ "from goods_info "
			+ "where goods_id_key "
			+ "in "
			+ "(select goods_id from shopping_car_info where user_id = #{user_id})")
	List<Goods> selectGoodsInCarByUserid(int user_id);
}
