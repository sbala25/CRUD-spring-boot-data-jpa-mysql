package com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.entity.Course;
import com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> findAll() {
		List<Course> courseList = courseRepository.findAll();
		return courseList;
	}

	@Override
	public Course save(Course course) {
		return courseRepository.saveAndFlush(course);
	}

	@Override
	public void delete(Course course) {
		courseRepository.delete(course);
		
	}

	@Override
	public Course findById(String id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course update(Course course) {
		courseRepository.save(course);
		return courseRepository.findById(course.getId()).get();
	}

	@Override
	public List<Course> findByCourseName(String courseTitle) {
		return courseRepository.findByCourseTitle(courseTitle);
	}

}
