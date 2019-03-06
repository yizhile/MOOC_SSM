package com.lzy.dao;

import com.lzy.domain.Kind;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KindDao {

    @Select("select * from kind")
    public abstract List<Kind> selectAllKinds();

    @Select("select * from kind where bigname=#{bigname} and smallname = #{smallname}")
    public abstract Kind selectKindByBigAngSmall(Kind kind);
}
