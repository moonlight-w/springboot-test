package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.Permit;
import com.moon.service.PermitService;

@Controller
@RequestMapping("/moon/Permit")
public class PermitController extends BaseController {
	@Autowired
	private PermitService permitService;

}