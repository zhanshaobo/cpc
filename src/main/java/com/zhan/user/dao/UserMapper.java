package com.zhan.user.dao;

import com.zhan.user.entity.TUser;

public interface UserMapper {
    
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);



    TUser selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}