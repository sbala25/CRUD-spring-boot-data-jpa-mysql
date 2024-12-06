package com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.entity.Course;
import com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.service.CourseService;

@RestController
@RequestMapping("api")
public class CourseRestController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("course")
	public List<Course> getAllCourse(){
		return courseService.findAll();
	}
	
	@PostMapping("course")
	public ResponseEntity<?> saveCourse(@RequestBody Course course) {
		Course newCourse = courseService.save(course);
		return ResponseEntity.status(HttpStatus.CREATED).body(newCourse);
	}
	
	@PutMapping("course")
	public Course updateCourse(@RequestBody Course course) {
//		Course course_db = courseService.findById(course.getId());
//		if(course_db == null)
//			return "User not found";
		return courseService.update(course);
	}
	
	@DeleteMapping("course")
	public String deleteCourse(@RequestParam String id) {
		Course course = courseService.findById(id);
		if(course == null)
			return "User not found";
		courseService.delete(course);
		return "deleted successfully";
	}
	
	@GetMapping("courseByTiile")
	public List<Course> getCourseByTitle(@RequestParam String title) {
		return courseService.findByCourseName(title);
	}

}
