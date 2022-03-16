package net.javaguides.sms.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String liststudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String CreateStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("students",student);
		return "create_student";
	}
	@PostMapping("/students")
	public String SaveStudent(@ModelAttribute("student") Student student) {
		studentService.SaveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String EditStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("students",studentService.GetStudentById(id));
		return "edit_student";
	}
	@PostMapping("students/{id}")
	public String UpdateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		//get student data from dadabase
		Student editStudent = studentService.GetStudentById(id);
		editStudent.setId(id);
		editStudent.setFirstName(student.getFirstName());
		editStudent.setLastName(student.getLastName());
		editStudent.setEmail(student.getEmail());
		//save and update 
		studentService.UpdateStudent(editStudent);
		return "redirect:/students";
	}
	@GetMapping("students/{id}")
	public String DeleteStudent(@PathVariable Long id) {
		studentService.DeleteStudent(id);
		return "redirect:/students";
	}
}
