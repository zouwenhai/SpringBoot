package com.zwh.plan.demo.highio.mapper;

import com.zwh.plan.demo.highio.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/7 18:38
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

     @Select("select * from user")
     List<User> queryUserList();
}
