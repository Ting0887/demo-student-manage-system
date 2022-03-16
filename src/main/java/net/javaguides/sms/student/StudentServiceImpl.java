package net.javaguides.sms.student;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@Override
	public Student SaveStudent(Student student) {
		return studentRepository.save(student);
		
	}
	@Override
	public Student GetStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	@Override
	public Student UpdateStudent(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public void DeleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
