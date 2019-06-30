package com.wh.mybatis.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wh.mybatis.core.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}