package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.repository.TeacherRepository;
import com.example.entity.Teacher;

@Controller
public class HomeController {
	
	@Autowired
	private TeacherRepository tr;

	@GetMapping("/")
	public String test() {
		return "login";
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("teacher_list",tr.findAll());
		return "plain_page";

	}
}
