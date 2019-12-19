package com.bigdata.shopping_analyse.mapper;

import com.bigdata.shopping_analyse.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    //登陆
    @Select("select username,userpwd from user_info where username=#{0} and userpwd = #{1}")
    public Account selectAccountIsExists(String username, String userpwd);
}
