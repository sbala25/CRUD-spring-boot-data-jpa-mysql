package com.bala.saikat.CRUD_spring_boot_data_jpa_mysql.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    
    private String description;

    private String title;
    
    private Date date;

	public Course() {
		super();
	}

	public Course(String id, String description, String title, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", description=" + description + ", title=" + title + ", date=" + date + "]";
	}

	
    

}
