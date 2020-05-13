package com.moon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.Score;
import com.moon.dao.ScoreMapper;

@Transactional
@Service
public class ScoreService {
	@Autowired
	private ScoreMapper scoreMapper;

	public ScoreMapper getScoreMapper() {
		return scoreMapper;
	}

}