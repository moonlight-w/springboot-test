package com.moon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.User;
import com.moon.dao.UserMapper;

@Transactional
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	// 根据账号密码获取用户
	public User selectByAccountAndPassword(String account, String password) {
		User crt = new User();
		crt.setAccount(account);
		crt.setPassword(password);
		return userMapper.selectOne(crt);
	}

	//
}