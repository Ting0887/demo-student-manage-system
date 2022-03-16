package net.javaguides.sms.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
	@Query("SELECT c FROM Course c WHERE c.courseName LIKE %?1%")
	public List<Course> Search(String keyword);
}
