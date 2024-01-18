package com.example.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.students.dto.ResponseDTO;
import com.example.students.model.Students;
import com.example.students.service.StudentsService;

@Controller
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentsService studentsService;

	@GetMapping("/getAllStudents")
	@ResponseBody
	public ResponseDTO getAllStudents()
	{
		return studentsService.getAllStudents();
	}
	
	@PostMapping("/addStudents")
	@ResponseBody
	public ResponseDTO addStudents(@RequestBody Students students) {
		return studentsService.addStudents(students);
	}
	
	@DeleteMapping("/deleteStudents")
	@ResponseBody
	public ResponseDTO deleteStudents(@RequestParam("stuId") long studentid) {
		return studentsService.deleteStudents(studentid);
	}
	
	@PutMapping("/editStudents")
	@ResponseBody
	public ResponseDTO editStudents(@RequestBody Students students) {
		return studentsService.editStudents(students);
	}
}
