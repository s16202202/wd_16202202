package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repository.TeacherRepository;
import com.example.entity.Teacher;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private TeacherRepository tr;

	@Test
	public void contextLoads() {
		Teacher t = tr.validTeacher("teacher", "123");
		assertEquals(t.getId(), 2);
	}

}
