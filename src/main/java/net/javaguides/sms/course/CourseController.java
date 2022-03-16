package net.javaguides.sms.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public String Course(Model model) {
		model.addAttribute("courses",courseService.getAllCourses());
		return "courses";
	}
	
	@PostMapping("/courses/search")
	public String CourseSearch(@ModelAttribute("courses") Course course,String keyword,Model model) {
		List<Course> CourseList = courseService.searchCourse(keyword);
		model.addAttribute("courses",CourseList);
		model.addAttribute("keyword", keyword);
		return "courses";
	}
}
