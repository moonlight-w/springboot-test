package com.moon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.TbRoom;
import com.moon.dao.TbRoomMapper;

@Transactional
@Service
public class TbRoomService {
	@Autowired
	private TbRoomMapper tbroomMapper;

	public TbRoomMapper getTbRoomMapper() {
		return tbroomMapper;
	}

}