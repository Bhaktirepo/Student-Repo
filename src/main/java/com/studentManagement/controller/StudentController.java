package com.studentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.entity.Student;
import com.studentManagement.service.StudentService;

@RestController
@RequestMapping(value = "/student") // http://localhost:8080/student

public class StudentController {

	@Autowired
	private StudentService studentService;

	// Get All Student
	@GetMapping(value = "/all") // http://localhost:8080/student/all
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	// Creating a new Student
	@PostMapping(value = "/create") // http://localhost:8080/student/create
	public Student createNewStudent(@RequestBody Student studentObj) {
		return studentService.createNewStudent(studentObj);
	}

	// Get Single Student
	@GetMapping(value = "/{Id}") // http://localhost:8080/student/1
	public Student getSingleStudent(@PathVariable("Id") Integer Id) {
		return studentService.getSingleStudent(Id);
	}

	// Update Student

	@PutMapping(value = "/{Id}/{newEmail}") // http://localhost:8080/student/1/new@gmail.com
	public Student updateStudent(@PathVariable("Id") Integer Id,
			@PathVariable("newEmail") String newEmail) {
		return studentService.updateStudent(Id, newEmail);
	}

	// Delete Student
	@DeleteMapping(value = "/{Id}") // http://localhost:8080/student/1
	public void deleteStudent(@PathVariable("Id") Integer Id) {
		studentService.deleteStudent(Id);
	}

}
