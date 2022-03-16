package net.javaguides.sms.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}
	@Override
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	@Override
	public List<Course> searchCourse(String keyword){
		if(keyword != null) {
			return courseRepository.Search(keyword);
		}
		return courseRepository.findAll();
	}
}
