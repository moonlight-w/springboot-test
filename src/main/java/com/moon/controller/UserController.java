package com.moon.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.User;
import com.moon.service.UserService;

@Controller
@RequestMapping("/moon/User")
public class UserController extends BaseController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(String account, String password, HttpSession sess) {
		User user = userService.selectByAccountAndPassword(account, password);
		if (user == null) {
			return "redirect:/login";
		}
		// success
		sess.setAttribute("user", user);
		return "redirect:/";
	}

	//
}