package io.priya.springbootstarter.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseService;
	

public List<Course> getAllCourses(String topicId){
	List<Course> courses=new ArrayList<>();
	courseService.findByTopicId(topicId).forEach(courses::add);
	return courses;
}
public Optional<Course> getCourse(String id) {
	return courseService.findById(id);
	
}
public void addCourse(Course course) {
	courseService.save(course);
	
}
public void updateCourse(Course course) {

		
	courseService.save(course);
	
}
public void deleteCourse(String id) {
	courseService.deleteById(id);
}


}
