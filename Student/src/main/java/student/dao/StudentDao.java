package student.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import student.model.Student;

@Component
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// create
	@Transactional
	public void createStudent(Student student) 
	{
		this.hibernateTemplate.save(student);
	}
	
	// get all students
	public List<Student> getStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	/*// delete the single student
	@Transactional
	public void deleteStudent(int sRollNo) {
		Student s = this.hibernateTemplate.load(Student.class, sRollNo);
		this.hibernateTemplate.delete(s);
	}
*/
	// get the single Student
	public Student getStudent(int sRollNo) {
		return this.hibernateTemplate.get(Student.class, sRollNo);
	}
	
	
	
	 
	
	

}
