package com.example.students.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students_info")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private long stuId;
	@Column(name = "student_name")
	private String stuName;
	@Column(name = "student_email")
	private String stuEmail;
	@Column(name = "student_branch")
	private String stuBranch;

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuBranch() {
		return stuBranch;
	}

	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}

	@Override
	public String toString() {
		return "Students [stuId=" + stuId + ", stuName=" + stuName + ", stuEmail=" + stuEmail + ", stuBranch="
				+ stuBranch + "]";
	}

}
