package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.UserPermit;
import com.moon.service.UserPermitService;

@Controller
@RequestMapping("/moon/UserPermit")
public class UserPermitController extends BaseController {
	@Autowired
	private UserPermitService userpermitService;

}