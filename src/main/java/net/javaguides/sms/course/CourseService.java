package net.javaguides.sms.course;

import java.util.List;

public interface CourseService {
	List<Course> getAllCourses();
	List<Course> searchCourse(String keyword);
}
