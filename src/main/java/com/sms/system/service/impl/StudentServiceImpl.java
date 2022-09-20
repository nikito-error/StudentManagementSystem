package com.sms.system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.system.entity.Student;
import com.sms.system.repository.StudentRepository;
import com.sms.system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
