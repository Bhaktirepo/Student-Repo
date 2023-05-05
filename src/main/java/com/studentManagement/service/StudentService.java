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

	public Student getSingleStudent(Integer Id) {
		return studentRepository.findById(Id).orElse(new Student());

	}

	// Update Student

	public Student updateStudent(Integer Id, String newEmail) {
		Student dbStudentObj = getSingleStudent(Id);
		dbStudentObj.setEmail(newEmail);
		return studentRepository.save(dbStudentObj);

	}

	// Delete Student
	public void deleteStudent(Integer Id) {
		studentRepository.deleteById(Id);
		// deleteById ==> delete from tbl_student where student_id=studentId
	}

}
