package com.tl.app;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author jky
 * @date 2018/5/25 17:58
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name=#{name}")
    User findUserByName(@Param("name")String name);
}
