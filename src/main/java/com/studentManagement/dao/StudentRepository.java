package com.studentManagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentManagement.entity.Student;

@Repository

public interface StudentRepository extends CrudRepository<Student,Integer>  {
		
} 