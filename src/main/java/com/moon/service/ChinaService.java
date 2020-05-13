package com.moon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.China;
import com.moon.dao.ChinaMapper;

@Transactional
@Service
public class ChinaService {
	@Autowired
	private ChinaMapper chinaMapper;

	public ChinaMapper getChinaMapper() {
		return chinaMapper;
	}

}