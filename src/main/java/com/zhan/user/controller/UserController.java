package com.zhan.user.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhan.user.entity.TUser;
import com.zhan.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Resource
	private IUserService userService;
	@RequestMapping("/getUserById.action")
	public String findUserById(String id,Model model){
		System.out.println(id);
		TUser user = userService.getTUserByUsername(new TUser(Integer.parseInt(id),"",""));
		model.addAttribute("user", user);
		return "showUser";
	}
}
