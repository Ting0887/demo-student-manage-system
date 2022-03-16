package net.javaguides.sms.course;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	private static final String Gene = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="course_name",nullable = false)
	private String courseName;
	
	@Column(name="course_type")
	private String courseType;
	
	@Column(name="teacher_name")
	private String teacherName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="credit")
	private String credit;
	
	public Course(){
		
	}
	public Course(String courseName, String courseType, String teacherName, String department, String credit) {
		super();
		this.courseName = courseName;
		this.courseType = courseType;
		this.teacherName = teacherName;
		this.department = department;
		this.credit = credit;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public static String getGene() {
		return Gene;
	}
}
