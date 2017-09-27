package com.zhan.user.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.zhan.user.dao.UserMapper;
import com.zhan.user.entity.TUser;
import com.zhan.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService
{	@Resource
	private UserMapper userMapper;
	
	@Override
	@Transactional
	public void insert(TUser user)
	{
		
		userMapper.insert(user);
//		int x = 10/0;
		
	}

	@Override
	@Transactional
	public void deleteById(int id)
	{
		userMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	@Transactional
	public void update(TUser user)
	{
		userMapper.updateByPrimaryKey(user);
		
	}

	@Override
	public TUser getTUserByUsername(TUser user)
	{
		return  userMapper.selectByPrimaryKey(user.getId());
		
	}

}
