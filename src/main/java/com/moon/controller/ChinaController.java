package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.China;
import com.moon.service.ChinaService;

@Controller
@RequestMapping("/moon/China")
public class ChinaController extends BaseController {
	@Autowired
	private ChinaService chinaService;

}