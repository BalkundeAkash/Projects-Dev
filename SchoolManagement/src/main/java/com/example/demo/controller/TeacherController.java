package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping("teacher")
public class TeacherController {

	private final TeacherRepository teacherRepository;

	@Autowired
	TeacherService teacherService;

	TeacherController(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	@PostMapping("add")
	public String addTeacher(@RequestBody Teacher teacher) {
		teacherService.saveTeacher(teacher);

		return MessageConstants.TEACHER_ADDED;
	}

	@DeleteMapping("{id}")
	public String deleteTeacher(@PathVariable int id) {
		teacherService.deleteTeacher(id);
		return MessageConstants.TEACHER_DELETED;
	}

	@GetMapping("{id}")
	Teacher getTeacher(@PathVariable int id) {
		Teacher teacher = teacherService.getTeacher(id);
		return teacher;

	}

}
