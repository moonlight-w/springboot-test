package com.moon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.Permit;
import com.moon.dao.PermitMapper;

@Transactional
@Service
public class PermitService {
	@Autowired
	private PermitMapper permitMapper;

	public PermitMapper getPermitMapper() {
		return permitMapper;
	}

	// 根据userAccount查出可操作的apis
	public List<String> selectApisByUserAccount(String account) {
		return permitMapper.selectApisByUserAccount(account);
	}

	//
}