package com.moon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.moon.entity.Student;
import com.moon.dao.StudentMapper;

@Transactional
@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

}