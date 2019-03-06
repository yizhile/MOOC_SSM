package com.lzy.dao;


import com.lzy.domain.UserLogin;
import org.apache.ibatis.annotations.Select;

public interface UserLoginDao {

    @Select("select * from userlogin where username=#{username} and password = #{password}")
    public abstract UserLogin selectUserLogin(UserLogin userLogin);
}
