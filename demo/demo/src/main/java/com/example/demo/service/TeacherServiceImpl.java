package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TeacherRepository;
import com.example.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherRepository tr;
	
    public List<Teacher> listTeachers() {
    	//TODO Auto-generated method stub
    	return tr.findAll();
    }
}
