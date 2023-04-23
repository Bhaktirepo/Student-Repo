package com.studentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.dao.StudentRepository;
import com.studentManagement.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	// Create Student

	public Student createNewStudent(Student inputObj) {

		return studentRepository.save(inputObj);

	}

	// Retrieve All Students

	public Iterable<Student> getAllStudents() {
		return studentRepository.findAll();

	}

	// Retrieve Single Student

	public Student getSingleStudent(Integer studentId) {
		return studentRepository.findById(studentId).orElse(new Student());

	}

	// Update Student

	public Student updateStudent(Integer studentId, String newEmail) {
		Student dbStudentObj = getSingleStudent(studentId);
		dbStudentObj.setEmail(newEmail);
		System.out.println("helo bikash");
		return studentRepository.save(dbStudentObj);

	}

	// Delete Student
	public void deleteStudent(Integer studentId) {
		studentRepository.deleteById(studentId);
		// deleteById ==> delete from tbl_student where student_id=studentId
	}

}
