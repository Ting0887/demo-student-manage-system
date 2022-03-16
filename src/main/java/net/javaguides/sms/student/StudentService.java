package net.javaguides.sms.student;

import java.util.List;

public interface StudentService {

	List<Student> getAllStudents();
	Student SaveStudent(Student student);
	Student GetStudentById(Long id);
	Student UpdateStudent(Student student);
	void DeleteStudent(Long id);
}
