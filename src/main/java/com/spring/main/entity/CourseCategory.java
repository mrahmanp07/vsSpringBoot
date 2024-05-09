package com.spring.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "course_category")
@Data
public class CourseCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_cat_id;
	
	@Column(name = "course_cat_name")
	private String courseCatName;

	public int getCourse_cat_id() {
		return course_cat_id;
	}

	public void setCourse_cat_id(int course_cat_id) {
		this.course_cat_id = course_cat_id;
	}

	public String getCourseCatName() {
		return courseCatName;
	}

	public void setCourseCatName(String courseCatName) {
		this.courseCatName = courseCatName;
	}
	
	
}
