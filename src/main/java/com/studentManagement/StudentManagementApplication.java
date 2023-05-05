package com.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentManagement.entity.Student;
import com.studentManagement.service.StudentService;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{
    
	@Autowired
	private StudentService  studentService;
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
		@Override
		public void run(String...args) throws Exception{

			Student inputObj=new Student();
			inputObj.setName("Bhaktiprasad Lenka");
			inputObj.setCourse("B.Tec");
			inputObj.setAddress("Odisha");
			inputObj.setEmail("bhakti@gmail.com");
			
			studentService.createNewStudent(inputObj);
		}
	

}
