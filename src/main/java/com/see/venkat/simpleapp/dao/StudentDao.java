package com.see.venkat.simpleapp.dao;

import java.util.List;

import com.see.venkat.simpleapp.model.Student;

public interface StudentDao {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void updateStudent(Student st);

	void deleteStudent(Student st);

}
