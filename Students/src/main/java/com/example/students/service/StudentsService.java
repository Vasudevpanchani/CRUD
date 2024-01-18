package com.example.students.service;

import com.example.students.dto.ResponseDTO;
import com.example.students.model.Students;

public interface StudentsService {
	
	ResponseDTO getAllStudents();
	
	ResponseDTO addStudents(Students students); 
	
	ResponseDTO deleteStudents(long studentid);
	
	ResponseDTO editStudents(Students students);

}
