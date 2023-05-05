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
	@Column(name = "id")
	private Integer Id;

	@Column(name = "name")
	private String Name;

	@Column(name = "course")
	private String Course;

	@Column(name = "addresss")
	private String Address;


	private String email;


	public Integer getId() {
		return Id;
	}


	public void setId(Integer Id) {
		this.Id = Id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public String getCourse() {
		return Course;
	}


	public void setCourse(String Course) {
		this.Course = Course;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String Address) {
		this.Address = Address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Student(String Name, String Course, String Address, String email) {
		super();
		this.Name = Name;
		this.Course = Course;
		this.Address = Address;
		this.email = email;
	}
   
	 public Student() {}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Course=" + Course
				+ ", Address=" + Address + ", email=" + email + "]";
	}
	
	
	

}
