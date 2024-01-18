package com.example.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.dto.ResponseDTO;
import com.example.students.model.Students;
import com.example.students.repository.StudentsRepo;

@Service
public class StudentsServiceImpl implements StudentsService {
	
	@Autowired
	private StudentsRepo studentsRepo;
	
	ResponseDTO response=new ResponseDTO();
	
	private void setResponseData(int status,String message,Object data) {
		response.setStatus(status);
		response.setMessage(message);
		response.setData(data);
	}

	@Override
	public ResponseDTO getAllStudents() {
		List<Students> allStudents = studentsRepo.findAll();
		if (allStudents.isEmpty()) {
			setResponseData(400, "Data is empty", "Any student is not there");
		}else {
			setResponseData(200, "All Students", allStudents);
		}
		return response;
	}

	@Override
	public ResponseDTO addStudents(Students students) {
		setResponseData(200, "Student Added Successfully", studentsRepo.save(students));
		return response;
	}

	@Override
	public ResponseDTO deleteStudents(long studentid) {
		Students students = studentsRepo.findById(studentid).get();
		if(students != null)
		{
			studentsRepo.deleteById(studentid);
			setResponseData(200, "Student Deleted", "Successfully Deleted");
		}else {
			setResponseData(400, "Student Not Deleted", "Student Not Found");
		}
		return response;
	}

	@Override
	public ResponseDTO editStudents(Students students) {
		Students editStudents = studentsRepo.findById(students.getStuId()).get();
		editStudents.setStuName(students.getStuName());
		editStudents.setStuEmail(students.getStuEmail());
		editStudents.setStuBranch(students.getStuBranch());
		setResponseData(200, "Student Data Changed", studentsRepo.save(editStudents));
		return response;
	}

	

}
