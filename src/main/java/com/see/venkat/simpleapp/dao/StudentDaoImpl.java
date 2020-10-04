package com.see.venkat.simpleapp.dao;

import java.util.List;

import com.see.venkat.simpleapp.model.Student;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("studentDao")
@Transactional
public class StudentDaoImpl extends AbstractDao<Long, Student> implements StudentDao {

	@Override
	public Student getStudent(Long id) {
		return getByKey(id);
	}

	@Override
	public Long saveStudent(Student st) {
		persist(st);
		return st.getId();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Student> listAllStudents() {
		Criteria criteria = createEntityCriteria();
		return (List) criteria.list();
	}

	@Override
	public void updateStudent(Student st) {
		update(st);
	}

	@Override
	public void deleteStudent(Student st) {
		delete(st);
	}

}
