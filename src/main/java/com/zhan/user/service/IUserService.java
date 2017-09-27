package com.zhan.user.service;

import com.zhan.user.entity.TUser;

public interface IUserService
{
	void insert(TUser user);
	void deleteById(int id);
	void update(TUser user);
	TUser getTUserByUsername(TUser user);
}
