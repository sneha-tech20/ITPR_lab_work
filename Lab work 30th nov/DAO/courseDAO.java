//package com.knmodi.collage.dao;
//
//public interface courseDAO {
	package com.knmodi.collage.dao;
	import com.knmodi.collage.model.course;
	import java.util.ArrayList;
	public interface courseDAO 
	{
		//method for inserting new course data
		int save(course courseData);
		
		//method to fetch all course list
		ArrayList<course> findAll();
		
		//method to fetch a particular course
		course findByCourseId(String courseId);
		
	}



