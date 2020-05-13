package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.TbRoom;
import com.moon.service.TbRoomService;

@Controller
@RequestMapping("/moon/TbRoom")
public class TbRoomController extends BaseController {
	@Autowired
	private TbRoomService tbroomService;

}