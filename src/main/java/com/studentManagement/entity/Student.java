package com.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private Integer studentId;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_course")
	private String studentcourse;

	@Column(name = "student_addresss")
	private String studentaddress;


	private String email;


	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentcourse() {
		return studentcourse;
	}


	public void setStudentcourse(String studentcourse) {
		this.studentcourse = studentcourse;
	}


	public String getStudentaddress() {
		return studentaddress;
	}


	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Student(String studentName, String studentcourse, String studentaddress, String email) {
		super();
		this.studentName = studentName;
		this.studentcourse = studentcourse;
		this.studentaddress = studentaddress;
		this.email = email;
	}
   
	 public Student() {}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentcourse=" + studentcourse
				+ ", studentaddress=" + studentaddress + ", email=" + email + "]";
	}
	
	
	

}
