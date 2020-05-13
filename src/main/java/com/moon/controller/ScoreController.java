package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.Score;
import com.moon.service.ScoreService;

@Controller
@RequestMapping("/moon/Score")
public class ScoreController extends BaseController {
	@Autowired
	private ScoreService scoreService;

}