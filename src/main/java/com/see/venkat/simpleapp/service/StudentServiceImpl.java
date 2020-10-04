package com.see.venkat.simpleapp.service;

import java.util.List;

import com.see.venkat.simpleapp.dao.StudentDao;
import com.see.venkat.simpleapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student getStudent(Long id) {
		return studentDao.getStudent(id);
	}

	@Override
	public Long saveStudent(Student st) {
		return studentDao.saveStudent(st);
	}

	@Override
	public List<Student> listAllStudents() {
		return studentDao.listAllStudents();
	}

	@Override
	public void update(Long id, Student st) {
		Student stEntity = studentDao.getStudent(id);
		if (stEntity != null) {
			stEntity.setFirstName(st.getFirstName());
			stEntity.setLastName(st.getLastName());
			stEntity.setGrade(st.getGrade());
			studentDao.updateStudent(stEntity);
		}
	}

	@Override
	public void delete(Long id) {
		Student stEntity = studentDao.getStudent(id);
		if (stEntity != null) {
			studentDao.deleteStudent(stEntity);
		}
	}

	@Override
	public boolean isStudentUnique(Long id) {
		Student student = studentDao.getStudent(id);
		return (student == null || (id != null & !id.equals(student.getId())));
	}

}
