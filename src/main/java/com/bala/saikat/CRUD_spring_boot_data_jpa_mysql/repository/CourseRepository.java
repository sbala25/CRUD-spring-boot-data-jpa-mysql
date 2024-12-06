package com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String>{
	
	@Query(value = "SELECT * FROM course WHERE title = ?1", nativeQuery = true)
	  List<Course> findByCourseTitle(String courseTitle);

}
