package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.course.Course;
import net.javaguides.sms.course.CourseRepository;
import net.javaguides.sms.student.StudentRepository;

import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception{
		/*
		Student student1 = new Student("王","小明","xiaomin@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("蔡","佳琪","giachi@gmail.com");
		studentRepository.save(student2);
	
		Student student3 = new Student("陸","霆洋","lutingyang@gmail.com");
		studentRepository.save(student3);
		*/
		/*
		Course course1 = new Course("機器學習","選修","蔡老師","資訊科學系","3");
		courseRepository.save(course1);
		Course course2 = new Course("論文寫作","必修","吳老師","資訊科學系","3");
		courseRepository.save(course2);
		*/
	}
}
