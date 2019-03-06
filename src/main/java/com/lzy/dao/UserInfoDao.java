package com.lzy.dao;


import com.lzy.domain.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserInfoDao {

    @Select("select * from userinfo where username = #{username}")
    public abstract UserInfo selectUserInfoByUsername(String username);
}
