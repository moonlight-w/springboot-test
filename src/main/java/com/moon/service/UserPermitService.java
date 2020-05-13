package com.moon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.UserPermit;
import com.moon.dao.UserPermitMapper;

@Transactional
@Service
public class UserPermitService {
	@Autowired
	private UserPermitMapper userpermitMapper;

	public UserPermitMapper getUserPermitMapper() {
		return userpermitMapper;
	}

}