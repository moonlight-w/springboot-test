package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import com.moon.model.SysUser;
import com.moon.utils.BaseController;

@Controller
public class HomeController extends BaseController {
	@Autowired
	RestTemplate rest;

	@RequestMapping("/")
	public String home() {
		return "woniu/home";
	}

	@RequestMapping("/openWork/{work}")
	public String openWork(@PathVariable("work") String work) {
		return "woniu/" + work;
	}

	@RequestMapping({ "/success", "/info" })
	public String success() {
		return "woniu/success";
	}

	@RequestMapping("/currUser")
	@ResponseBody
	public SysUser currUser(String token) {
		return null;
	}

	//
}