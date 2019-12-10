package com.bigdata.shopping_analyse.mapper;

import com.bigdata.shopping_analyse.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegistMapper {
    //注册
    @Insert("insert into user_info (username,userpwd) values(#{username},#{password})")
    public int add(User user);
    //判断是否存在
    @Select("select count(username) from user_info where username=#{username}")
    public int get(User user);
}
