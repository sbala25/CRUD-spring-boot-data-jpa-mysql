package com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.service;

import java.util.List;

import com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.entity.Course;

public interface CourseService {
	
	public List<Course> findAll();
	public Course findById(String id);
	public Course save(Course course);
	public Course update(Course course);
	public void delete(Course course);
	public List<Course> findByCourseName(String courseTitle);

}
