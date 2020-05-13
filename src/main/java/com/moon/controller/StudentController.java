package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.Student;
import com.moon.service.StudentService;

@Controller
@RequestMapping("/moon/Student")
public class StudentController extends BaseController {
	@Autowired
	private StudentService studentService;

}