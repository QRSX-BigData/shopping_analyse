package com.bigdata.shopping_analyse.mapper;

import com.bigdata.shopping_analyse.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegistMapper {
	// 注册
	@Insert("insert into user_info (username,userpwd) values(#{username},#{password})")
	int add(Account account);

	// 判断是否存在
	@Select("select count(username) from user_info where username=#{username}")
	int get(Account account);

	// 登陆
	@Select("select user_id_key，username，userpwd，address，shopping_success_num，shopping_fail_num，total_money_shopping_success，total_money_shopping_fail，last_login_time，create_id，create_time from user_info where username=#{0} and userpwd = #{1}")
	Account select(String username, String userpwd);

	// 查找用户名id
	@Select("select user_id_key from user_info where username=#{username}")
	int selectidbyname(String username);

}
